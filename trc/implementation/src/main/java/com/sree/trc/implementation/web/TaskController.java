package com.sree.trc.implementation.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController{

    @RequestMapping("/task")
    public String index() {
        return "Greetings from TRC!";
    }

}
