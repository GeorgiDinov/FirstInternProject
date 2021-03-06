package com.intenrship.intracol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class FirstInternProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstInternProjectApplication.class, args);
		log.info("Hello From The Console");
	}

}
