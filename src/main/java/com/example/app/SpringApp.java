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
        String message = null;
        if (args.length > 0) {
            message = args[0];
        }
        System.out.println("Length: " + message.length());
        SpringApplication.run(SpringApp.class, args);
    }
}
