package com.kriukov.microservices.demo.eurekasecondclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaSecondClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSecondClientApplication.class, args);
    }

}
