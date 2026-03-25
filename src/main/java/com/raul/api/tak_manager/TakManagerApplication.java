package com.raul.api.tak_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.raul.api.tak_manager") 
public class TakManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TakManagerApplication.class, args);
    }
}