package com.clean.application;

import com.dirkheijnen.mediator.implementation.Mediator;
import com.dirkheijnen.mediator.interfaces.IMediator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.clean.persistence")
public class Application {

    @Autowired
    ApplicationContext applicationContext;

    @Bean
    public IMediator mediator(){
        return new Mediator(applicationContext);
    }
}
