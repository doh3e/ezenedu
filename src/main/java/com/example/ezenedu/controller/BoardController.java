package com.example.ezenedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/board_free_page")
    public String freeboard1(){
        return "/board/board_free_page";
    }

    @GetMapping("/board_free_input")
    public String freeboard2(){
        return "/board/board_free_input";
    }
}
