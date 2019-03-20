package com.example.demo.serviceImpl;

import com.example.demo.domain.BlocksToDisplay;
import com.example.demo.domain.CourseToDisplay;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public CourseToDisplay findByUsername(String blockName) {
        return null;
    }

    @Override
    public CourseToDisplay findByCourseID(String blockName, Long id) {
        return null;
    }

    @Override
    public CourseToDisplay saveBlockTodisplay(BlocksToDisplay course) {
        return null;
    }

    @Override
    public List<CourseToDisplay> findallCourse() {
        return courseRepository.findAll();
    }

}
