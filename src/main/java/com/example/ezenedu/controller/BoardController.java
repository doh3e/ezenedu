package com.example.ezenedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/board_free")
    public String board(){
        return "board_free";
    }
}
