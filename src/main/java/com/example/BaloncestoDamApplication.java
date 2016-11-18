package com.example;

import com.example.Service.EquipoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaloncestoDamApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(BaloncestoDamApplication.class, args);
		EquipoService equiposervice=context.getBean(EquipoService.class);

		equiposervice.run();

	}
}