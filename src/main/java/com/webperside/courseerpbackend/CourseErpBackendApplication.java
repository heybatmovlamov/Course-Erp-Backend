package com.webperside.courseerpbackend;

import com.webperside.courseerpbackend.model.properties.security.SecurityProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
@RequiredArgsConstructor
public class 	CourseErpBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CourseErpBackendApplication.class, args);

	}


	private final SecurityProperties securityProperties;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(securityProperties);
	}



}
