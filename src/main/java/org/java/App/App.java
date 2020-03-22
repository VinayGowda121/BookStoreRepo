package org.java.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"org.java.controller","org.java.service","org.java.utils"})
@EntityScan("org.java.model")
@EnableJpaRepositories("org.java.dao")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
