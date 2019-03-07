package com.zyq1.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ApplicationPower1002 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationPower1002.class,args);
    }
}
