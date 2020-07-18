package com.huseyinaydin.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.huseyinaydin.validation.RegisterValidation;

@Configuration
public class Beans {
	
	@Bean(name = "registerValidation")
	public RegisterValidation getRegisterValidation() {
		return new RegisterValidation();
	}
}
