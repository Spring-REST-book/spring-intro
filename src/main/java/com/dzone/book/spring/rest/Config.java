package com.dzone.book.spring.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Car car(Engine engine) {
        return new Car(engine);
    }
    
    @Bean
    public CombustionEngine combustionEngine(Starter starter) {
        return new CombustionEngine(starter);
    }
    
    @Bean
    public ElectricStarter electricStarter() {
        return new ElectricStarter();
    }
}
