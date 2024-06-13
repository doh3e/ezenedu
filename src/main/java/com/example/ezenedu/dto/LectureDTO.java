package com.example.ezenedu.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class LectureDTO {
    int lectnum;
    String lectthumbnail, lect, lectname, lectsubject, lectgrade, lectintro;
    int lecttime;
    String lectcategory1, lectcategory2, lectbook, lectdifficulty, lectindex;
}