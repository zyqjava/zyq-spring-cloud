package com.zyq.web.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProducerController2 {

    @RequestMapping(value = "index.do")
    @ResponseBody
    public List<Map<String, String>> index() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("keyTest2","test222");
        list.add(map);
        return list;
    }
}
