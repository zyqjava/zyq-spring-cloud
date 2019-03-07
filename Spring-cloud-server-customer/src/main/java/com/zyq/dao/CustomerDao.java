package com.zyq.dao;

import com.zyq.fegin.ClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@FeignClient(name = "microservice-2000-producer",fallback = ClientFallback.class)
public interface CustomerDao {

    @RequestMapping(value = "index.do")
    @ResponseBody
    public List<Map<String, String>> index();
}
