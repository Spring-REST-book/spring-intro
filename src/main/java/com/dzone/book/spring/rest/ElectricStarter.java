package com.dzone.book.spring.rest;

import org.springframework.stereotype.Component;

@Component
public class ElectricStarter implements Starter {
    
    @Override
    public void start() {
        System.out.println("Started electric starter");
    }
}
