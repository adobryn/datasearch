package com.cities.datasearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataSearchApplication {

	static void initDataSets(){

	}

	public static void main(String[] args) {
		initDataSets();
		SpringApplication.run(DataSearchApplication.class, args);
	}

}
