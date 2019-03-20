package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.domain.BlockSession;
import com.example.demo.domain.MeditationRecord;
import com.example.demo.domain.Person;
import com.example.demo.domain.Place;
import com.example.demo.domain.Student;
import com.example.demo.domain.TypeTM;
import com.example.demo.repository.BlockSessionRepository;
import com.example.demo.repository.MeditationRecordRepository;
import com.example.demo.repository.PlaceRepository;
import com.example.demo.repository.TypeTmRepository;
import com.example.demo.storage.StorageException;
import com.example.demo.storage.StorageFileNotFoundException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
 
@Service
public class FileSystemStorageService implements StorageService
{
 
    private final Path rootLocation = Paths.get("upload-dir");
 
    @Autowired
    PersonService personService;
    
    @Autowired
    PlaceRepository placeRepository;
    @Autowired
    TypeTmRepository typeTmRepository;
    @Autowired
    MeditationRecordRepository meditationRecordRepository;
    @Autowired
    BlockSessionRepository blockSessionRepository;
    /**
     * 保存文件
     *
     * @param file 文件
     */
    @Override
    public void store(MultipartFile file)
    {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try
        {
            if (file.isEmpty())
            {
                throw new StorageException("Failed to store empty file " + filename);
            }
            if (filename.contains(".."))
            {
                // This is a security check
                throw new StorageException("Cannot store file with relative path outside current directory " + filename);
            }
            Files.copy(file.getInputStream(), this.rootLocation.resolve(filename), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e)
        {
            throw new StorageException("Failed to store file " + filename, e);
        }
    }
 
    /**
     * 列出upload-dir下面所有文件
     * @return
     */
    @Override
    public Stream<Path> loadAll()
    {
        try
        {
            return Files.walk(this.rootLocation, 1)  //path -> !path.equals(this.rootLocation)
                    .filter(new Predicate<Path>()
                    {
                        @Override
                        public boolean test(Path path)
                        {
                            return !path.equals(rootLocation);
                        }
                    });
        }
        catch (IOException e)
        {
            throw new StorageException("Failed to read stored files", e);
        }
 
    }
 
    @Override
    public Path load(String filename)
    {
        return rootLocation.resolve(filename);
    }
 
    /**
     * 获取文件资源
     * @param filename 文件名
     * @return Resource
     */
    @Override
    public Resource loadAsResource(String filename)
    {
        try
        {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable())
            {
                return resource;
            }
            else
            {
                throw new StorageFileNotFoundException("Could not read file: " + filename);
 
            }
        }
        catch (MalformedURLException e)
        {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }
 
    /**
     * 删除upload-dir目录所有文件
     */
    @Override
    public void deleteAll()
    {
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }
 
    /**
     * 初始化
     */
    @Override
    public void init()
    {
        try
        {
            Files.createDirectories(rootLocation);
        }
        catch (IOException e)
        {
            throw new StorageException("Could not initialize storage", e);
        }
    }

    public String readFromInputStream(InputStream inputStream)
    		  throws IOException {
    		    //StringBuilder resultStringBuilder = new StringBuilder();
    		    List<MeditationRecord> meditationRecordList = new ArrayList<>();
    		    try (BufferedReader br
    		      = new BufferedReader(new InputStreamReader(inputStream))) {
    		        String line;
    		        while ((line = br.readLine()) != null) {
    		        	MeditationRecord newObject = new MeditationRecord();
    		        	if("".equals(line.trim())) continue;
    		        	String[] record = line.split(",");
    		        	String barcode = record[0];
    		        	String date = record[1];
    		        	String type = record[2];
    		        	String location = record[3];
    		        	
    		        	//line = "5726,02/15/17,AM,DB";
    		        	// ger person from barcode
    		        	System.out.println("barcode: " + barcode);
    		        	Person person = personService.findByBarCode(barcode);
    		        	System.out.println("person: " + person);
    		        	if (person != null && person instanceof Student)
    		        			newObject.setStudent((Student) person);
    		        	
    		        	//check todays date and find blocksession
    		        	//location
    		        	Place place = placeRepository.findByPlaceId(location);
    		        	TypeTM typeTM =  typeTmRepository.findBytypeID(type);   		        	
    		        	//implementation pending
    		        	System.out.println("==============");
    		        	System.out.println("sessiondate: " + date);
    		        	SimpleDateFormat formatter = new SimpleDateFormat( "MM/dd/yy");
    		        	Date curDate = null;
						try {
							curDate = formatter.parse(date);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("==============");
    		        	System.out.println("curdate: " + curDate);
    		        	BlockSession blockSession = blockSessionRepository.findBySession(curDate);
    		        	newObject.setPlace(place);
    		        	newObject.setTypeTM(typeTM);
    		        	newObject.setBlockSession(blockSession);
    		        	meditationRecordList.add(newObject);
    		        	
    		    }
    		  meditationRecordRepository.saveAll(meditationRecordList);
    		  return meditationRecordRepository.toString();
    }
    }
}
