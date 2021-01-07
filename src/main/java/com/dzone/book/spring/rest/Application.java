package com.dzone.book.spring.rest;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dzone.book.spring.rest")
public class Application {

    public static void main(String[] args) {

        try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Application.class)) {
            Car car = context.getBean(Car.class);
            car.start();
        }
    }
}
