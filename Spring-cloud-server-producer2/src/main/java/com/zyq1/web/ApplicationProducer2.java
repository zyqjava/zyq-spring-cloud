package com.zyq1.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ApplicationProducer2 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationProducer2.class,args);
    }
}
