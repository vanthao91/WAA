package com.example.demo.validation;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TextFileValidator implements ConstraintValidator<ValidTextFile, MultipartFile> {

    @Override
    public void initialize(ValidTextFile constraintAnnotation) {

    }

    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext context) {

        boolean result = true;

        String contentType = multipartFile.getContentType();
        System.out.println("contentType: " + contentType);
        String type = contentType.split("/")[0];
        System.out.println(type);
        if (!isSupportedContentType(type)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(
                    "Only TXT files are allowed.")
                   .addConstraintViolation();

            result = false;
        }

        return result;
    }

    private boolean isSupportedContentType(String contentType) {
    	
    	
        return contentType.equals("text");
    }
}
