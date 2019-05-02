package edu.eci.segi_project.aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = { "edu.eci.segi_project" })
public class SegiAplication {

	public static void main(String[] args) {
		SpringApplication.run(SegiAplication.class, args);
	}
}