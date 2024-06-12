package com.example.ezenedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/member_join")
    public String join1(){

        return "member/member_join";
    }
}
