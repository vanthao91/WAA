package com.example.demo.service;

import com.example.demo.domain.BlocksToDisplay;
import com.example.demo.domain.CourseToDisplay;

import java.util.List;

public interface CourseService {
    CourseToDisplay findByUsername(String blockName);
    CourseToDisplay findByCourseID(String blockName, Long id);
    CourseToDisplay saveBlockTodisplay(BlocksToDisplay course);
    List<CourseToDisplay> findallCourse();
}
