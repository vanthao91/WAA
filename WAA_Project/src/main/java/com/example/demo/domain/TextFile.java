package com.example.demo.domain;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.validation.ValidTextFile;

public class TextFile {

			@ValidTextFile
			private MultipartFile file;

			public MultipartFile getFile() {
				return file;
			}

			public void setFile(MultipartFile file) {
				this.file = file;
			}

//			public void setTextFile(MultipartFile textFile) {
//				this.file = textFile;
//			}
//			
			
			
}
