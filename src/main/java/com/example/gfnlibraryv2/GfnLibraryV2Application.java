package com.example.gfnlibraryv2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GfnLibraryV2Application {

	private static final Logger log = 
		LoggerFactory.getLogger(GfnLibraryV2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(GfnLibraryV2Application.class, args);
	}

	// @Bean
	// public CommandLineRunner demo(GameRepository repository) {
	// 	// Create a few games
	// }
}
