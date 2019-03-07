package com.zyq.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@FeignClient(name = "microservice-2000-producer")
public interface CustomerDao {

    @RequestMapping(value = "index.do")
    @ResponseBody
    public List<Map<String, String>> index();
}
