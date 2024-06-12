package com.example.ezenedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String main1(){
        return "main";
    }

    @GetMapping("/main")
    public String main2(){
        return "main";
    }

    @GetMapping("/top")
    public String main3(){
        return "top";
    }
}
