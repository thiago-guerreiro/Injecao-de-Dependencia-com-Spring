package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.PayService;

@SpringBootApplication
public class InjecaoDependenciaApplication implements CommandLineRunner {
	
	@Autowired
	private PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RESULTADO: " + payService.finalPrice(300.0, "SC"));
	}

}
