package com.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

<<<<<<< HEAD
@ImportResource(value = {"classpath:applicationContext.xml"})
=======
@ImportResource(value = {"classpath:spring.xml"})
>>>>>>> branch 'master' of https://github.com/xiluhua/springBoot-02.git
@SpringBootApplication
public class SpringBoot02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02Application.class, args);
	}

}

