package com.dailycodebuffer.Springboottutorial2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {
        return "Welcome to Daily Code Buffer";
    }
}
