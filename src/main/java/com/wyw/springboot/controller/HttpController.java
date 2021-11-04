package com.wyw.springboot.controller;

import com.wyw.springboot.entity.School;
import com.wyw.springboot.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HttpController {
    @Autowired
    private School school;

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return school.getName() + school.getSite();
    }

    @GetMapping("/redis/{key}/{value}")
    public void putRedis(@PathVariable("key")String key,@PathVariable("value")Integer value){
        userService.put(key,value);
    }

    @GetMapping("/redis/{key}")
    public Object getRedis(@PathVariable("key") String key){
        return userService.get(key);
    }
}
