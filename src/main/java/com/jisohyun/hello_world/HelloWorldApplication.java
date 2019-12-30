package com.jisohyun.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("HELLO WORLD");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello world commandlinerunner");
	}
}
