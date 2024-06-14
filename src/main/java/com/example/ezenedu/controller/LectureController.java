package com.example.ezenedu.controller;

import com.example.ezenedu.dto.LectureDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class LectureController {


    static final String image_path="C:\\이젠디지탈12\\spring_boot\\ezenedu\\src\\main\\resources\\static\\image";

    @GetMapping("/lectureinput")
    public String lectureinput(){
        return "/lecture/lecture_input";
    }

    @PostMapping("lecturesave")
    public String lecturesave(LectureDTO dto, MultipartHttpServletRequest mul){
        int count;

        return "";
    }
}
