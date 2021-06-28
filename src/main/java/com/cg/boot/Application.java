package com.cg.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//boot-strapping - class which will run the spring boot application
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
/*
 * @SpringBootApplication
 * 	1> EnaableAutoConfiguration
 * 2> Component Scan
 * 
 */
