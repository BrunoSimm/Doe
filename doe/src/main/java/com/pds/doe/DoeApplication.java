package com.pds.doe;

import java.util.Base64;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoeApplication.class, args);
		String encodedFile = Base64.getEncoder().encodeToString(new byte[1024]);
	}

}
