package com.psc.cloud1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cloud1")
public class HelloController {

    @GetMapping("/hello")
    public String home() {
        return "Hello Cloud-1";
    }

}
