package com.ijia.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * tll
 * 2019/10/31
 */

@RestController
public class HelloController {
    @GetMapping("hello")
    public String Hello(){
        return "Welcome to Gateway";
    }


}
