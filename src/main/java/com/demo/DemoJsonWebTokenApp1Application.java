package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJsonWebTokenApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoJsonWebTokenApp1Application.class, args);
		System.out.println("Spring boot maven jwt-db demo");
	}

}
