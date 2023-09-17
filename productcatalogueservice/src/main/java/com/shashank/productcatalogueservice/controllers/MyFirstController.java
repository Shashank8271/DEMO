package com.shashank.productcatalogueservice.controllers;

import com.shashank.productcatalogueservice.service.MyFirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
    public MyFirstService myFirstService;
    private MyFirstController (MyFirstService myFirstService) {
        this.myFirstService = myFirstService;
    }
    @GetMapping("/ji")
    public String SayHi(){
        return "Ji";
    }

}
