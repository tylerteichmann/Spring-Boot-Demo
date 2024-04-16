package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Controllers.HomeController;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	HomeController homeController;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
