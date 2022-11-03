package com.spring.boot.csv.files;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories("com.*")
@ComponentScan(basePackages = {"com.*"})
@EntityScan("com.*")
@SpringBootApplication()
public class SpringBootCsvFilesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCsvFilesBackendApplication.class, args);
	}

}
