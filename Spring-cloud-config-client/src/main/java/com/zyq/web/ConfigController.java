package com.zyq.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${shoujin}")
    private String shoujin;

    @GetMapping("/getInfo")
    public String getInfo(){
        return  shoujin;
    }
}
