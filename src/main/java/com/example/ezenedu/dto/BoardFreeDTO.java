package com.example.ezenedu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BoardFreeDTO {
    int serial;
    String writer, title, contents, category, writeday;
    String review, hashtag;
    String lect, lect_teacher;
    int rating;
    int readcnt, groups, step, indent;
    String modified;

    //public BoardFreeEntity entity(){
//        return new BoardFreeEntity(id, name, hiredate);
//    }

}
