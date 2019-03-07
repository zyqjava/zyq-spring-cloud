package com.zyq.controller;

import com.zyq.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    CustomerDao customerDao;

    @RequestMapping("/hello")
    @ResponseBody
    public List<Map<String, String>> index() {
        return customerDao.index();
    }
}
