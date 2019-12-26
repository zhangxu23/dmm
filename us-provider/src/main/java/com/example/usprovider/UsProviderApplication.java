package com.example.usprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsProviderApplication.class, args);
    }

}
