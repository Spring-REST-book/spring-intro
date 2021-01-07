package com.dzone.book.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CombustionEngine implements Engine {
    
    private Starter starter;
    
    @Autowired
    public CombustionEngine(Starter starter) {
        this.starter = starter;
    }
    
    @Override
    public void turnOn() {
        starter.start();
        System.out.println("Started combustion engine");
    }
}
