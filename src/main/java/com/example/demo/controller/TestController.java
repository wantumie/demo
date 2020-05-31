package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe
 *
 * @Auther Mr.Garfield
 * @Date 2020/06/2020/6/1
 */
@RestController
@RequestMapping
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public String test(String id){
        String name = testService.testService(id);
        return name;
    }
}
