package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.TextFile;
import com.example.demo.service.StorageService;
import com.example.demo.storage.StorageFileNotFoundException;

@Controller
public class ImportFileController {
	
	@Autowired
	private StorageService storageService;
	
//	
//	@GetMapping("/importFile")
//	public String index() {
//		return "importFile";
//	}
	
	 @GetMapping("/admin/importFile")
	    public String listUploadedFiles(@ModelAttribute("textFile") TextFile textFile, Model model) throws IOException {
	        model.addAttribute("files", storageService.loadAll().map(
	                path -> MvcUriComponentsBuilder.fromMethodName(ImportFileController.class,
	                        "serveFile", path.getFileName().toString()).build().toString())
	                .collect(Collectors.toList()));
	        System.out.println(storageService.loadAll().map(
	                path -> MvcUriComponentsBuilder.fromMethodName(ImportFileController.class,
	                        "serveFile", path.getFileName().toString()).build().toString())
	                .collect(Collectors.toList()));
	        return "importFile";
	    }
	 
	    @GetMapping("/files/{filename:.+}")
	    @ResponseBody
	    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {
	 
	        Resource file = storageService.loadAsResource(filename);
	        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
	                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
	    }
<<<<<<< Updated upstream
	 
	    @PostMapping("/admin/importFile")
=======
	    
	    @PostMapping(value = "/importFile", consumes = "text/csv")
	    public void uploadSimple(@RequestBody InputStream body) {
	        //repository.saveAll(CsvUtils.read(User.class, body);
	    }
	    
	    @PostMapping("/importFile")
>>>>>>> Stashed changes
	    public String handleFileUpload(@Valid @ModelAttribute("textFile") TextFile textFile, BindingResult bindingResult,
	            RedirectAttributes redirectAttributes){
	    	MultipartFile file = textFile.getFile();
	    	if(bindingResult.hasErrors()) {
	    		System.out.println("=====");
	    		
	    		return "importFile";
	    	}
	    	 try {
		        storageService.store(file);
		        String textFilename = StringUtils.cleanPath(file.getOriginalFilename());
		        Resource fileResource = storageService.loadAsResource(textFilename);
		        InputStream fsStream = fileResource.getInputStream();
		        String results = storageService.readFromInputStream(fsStream);
				redirectAttributes.addFlashAttribute("message",
			                "You successfully uploaded " + file.getOriginalFilename() + "!");
					
			} 
	       catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return "redirect:/importFile";
	         
	    }

	
	    @ExceptionHandler(StorageFileNotFoundException.class)
	    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
	        return ResponseEntity.notFound().build();
	    }
	 
	}


