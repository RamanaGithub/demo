package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.springjenkinsdemo1.SpringJenkinsdemo1Application;

@SpringBootApplication
public class DemoApplication {
	
	public static Logger logger=LoggerFactory.getLogger(DemoApplication.class);
	@PostConstruct
	public void init() {
		logger.info("Application started.........");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
