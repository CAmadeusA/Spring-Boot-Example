package com.christianarchuleta.example.animal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AnimalApplication {

	public static void main(String[] args) {
		log.info("NOW STARTING ANIMAL APPLICATION");
		SpringApplication.run(AnimalApplication.class, args);
	}

}
