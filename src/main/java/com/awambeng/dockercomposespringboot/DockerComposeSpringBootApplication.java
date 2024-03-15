package com.awambeng.dockercomposespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.awambeng.dockercomposespringboot.repository"})
public class DockerComposeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerComposeSpringBootApplication.class, args);
	}

}
