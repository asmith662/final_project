package com.cit_562.final_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.core.config.Configurator;

@SpringBootApplication
public class FinalProjectApplication {

	public static void main(String[] args) {
		Configurator.initialize(null, "src/main/resources/log4j2.xml");
		SpringApplication.run(FinalProjectApplication.class, args);
	}

}
