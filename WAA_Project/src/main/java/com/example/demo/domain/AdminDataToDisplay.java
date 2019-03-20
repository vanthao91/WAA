package com.example.demo.domain;

import java.util.HashMap;

public class AdminDataToDisplay {

    private HashMap<Block, Integer>  numberofAttendaceInBlock;

    private  HashMap<Course, Integer> numberofAttendaceInCourse;

    public HashMap<Block, Integer> getNumberofAttendaceInBlock() {
        return numberofAttendaceInBlock;
    }

    public void setNumberofAttendaceInBlock(HashMap<Block, Integer> numberofAttendaceInBlock) {
        this.numberofAttendaceInBlock = numberofAttendaceInBlock;
    }

    public HashMap<Course, Integer> getNumberofAttendaceInCourse() {
        return numberofAttendaceInCourse;
    }

    public void setNumberofAttendaceInCourse(HashMap<Course, Integer> numberofAttendaceInCourse) {
        this.numberofAttendaceInCourse = numberofAttendaceInCourse;
    }
}
