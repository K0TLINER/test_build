package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getTest() {
        return "GGET";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String postTest() {
        return "PPOST";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloTest() {
        return "HELLO";
    }
}
