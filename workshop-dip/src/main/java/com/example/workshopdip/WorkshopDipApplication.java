package com.example.workshopdip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class WorkshopDipApplication {

	@Bean
	public Random createMyRandom(){
		return new Random();
	}

	public static void main(String[] args) {
		SpringApplication.run(WorkshopDipApplication.class, args);
	}

}
