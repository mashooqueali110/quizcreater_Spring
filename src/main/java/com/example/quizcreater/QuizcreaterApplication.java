package com.example.quizcreater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.quizcreater")
@SpringBootApplication
public class QuizcreaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizcreaterApplication.class, args);
    }

}
