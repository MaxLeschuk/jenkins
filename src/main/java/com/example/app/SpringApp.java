package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApp {
    private SpringApp() {
        throw new UnsupportedOperationException("Utility class");
    }
    /**
     * Main method to start the Spring Boot application.
     * @param args Command-line arguments.
     */
    public static void main(final String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}
