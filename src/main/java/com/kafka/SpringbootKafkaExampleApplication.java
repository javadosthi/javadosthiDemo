package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootKafkaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaExampleApplication.class, args);
		System.out.println("Hello master branch pull into backupdemo branch");
		System.out.println("committing into master  conflict modified ");
		System.out.println("this is final code branch");
	}

}
