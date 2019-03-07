package com.zyq.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationProducer3 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationProducer3.class,args);
    }
}
