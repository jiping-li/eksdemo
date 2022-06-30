package com.openlane.eksdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.openlane.eksdemo")
public class EksdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EksdemoApplication.class, args);
	}

}
