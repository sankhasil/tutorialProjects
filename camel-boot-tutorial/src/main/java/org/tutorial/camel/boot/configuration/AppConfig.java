package org.tutorial.camel.boot.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppConfig {

	public AppConfig() {
	}
	
	public static void main(String...s){
		SpringApplication.run(AppConfig.class, s);
	}

}
