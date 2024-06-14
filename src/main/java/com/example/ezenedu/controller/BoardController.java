package com.example.ezenedu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BoardController {

    private String realPath =
            "C:\\이젠디지털12\\spring-boot\\ezenedu\\src\\main\\resources\\static\\image\\upload\\board_free";

    @GetMapping("/board_free")
    @GetMapping("/board_free_page")
    public String freeboard1(){
        return "/board/board_free_page";
    }

    @GetMapping("/board_free_input")
    public String freeboard2(){
        return "/board/board_free_input";
    }

}
