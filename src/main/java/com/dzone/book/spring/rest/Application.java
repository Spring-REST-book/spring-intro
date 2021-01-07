package com.dzone.book.spring.rest;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        
        try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            Car car = context.getBean(Car.class);
            car.start();
        }
    }
}
