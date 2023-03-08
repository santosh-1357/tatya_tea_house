package com.tatyateahouse.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication
@SpringBootConfiguration
@EntityScan(basePackages = "com.tatyateahouse")
public class TatyaTeaHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TatyaTeaHouseApplication.class, args);
	}

}
