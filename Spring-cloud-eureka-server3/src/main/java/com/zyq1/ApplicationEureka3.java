package com.zyq1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka3 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka3.class,args);
    }
}
