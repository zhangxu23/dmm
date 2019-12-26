package com.example.zxconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZxConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxConfigApplication.class, args);
    }

}
