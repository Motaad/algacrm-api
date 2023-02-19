package com.algaworks.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories("com.algaworks.crm.repository.*")
@EntityScan("com.algaworks.crm.model.*")   
@SpringBootApplication
public class AlgacrmApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgacrmApiApplication.class, args);
	}

}
