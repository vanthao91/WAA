package com.example.demo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserNameValidator.class)
public @interface UserName {

	String message() default "{validator.UserName.message}";

	Class<?>[] groups() default {};

	public abstract Class<? extends Payload>[] payload() default {};

}
