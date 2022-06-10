package com.example.bogdashka.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buy-methods")
public class BuyMethodsController {
    @GetMapping
    public String getBuyMethods(){
        return "buy-robux";
    }
}
