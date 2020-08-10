package com.clean.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
@PropertySource("classpath:connection.properties")
@SpringBootApplication
@ComponentScan("com.*")
public class PresentationApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresentationApplication.class, args);
    }

}
