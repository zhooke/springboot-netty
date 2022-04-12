package com.example.springbootnetty.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhooke
 * @since 2022/4/7 15:31
 **/
@RequestMapping
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}
