package com.webperside.courseerpbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class 	CourseErpBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CourseErpBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		String test = passwordEncoder.encode("test");
		System.out.println(test);
	}
}
