package com.example.studentcoursemanagementapp.controller;


import com.example.studentcoursemanagementapp.dto.*;
import com.example.studentcoursemanagementapp.entity.Course;
import com.example.studentcoursemanagementapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping(path = "/save")
    public String saveCourse(@RequestBody CourseSaveDTO courseSaveDTO){

        String course = courseService.addCourse(courseSaveDTO);
        return course;
    }
    @GetMapping("/{courseid}")
    public Course getCourseById(@PathVariable int courseid) {
        return courseService.getCourseById(courseid);
    }
    @GetMapping("/getAllCourses")
    public List<CourseDTO> getAllCourses(){
        List<CourseDTO> allCourses=courseService.getAllCourses();
        return allCourses;
    }
    @PutMapping(path = "/update")
    public String updateCourse(@RequestBody CourseUpdateDTO courseUpdateDTO){

        String coursename = courseService.updateCourse(courseUpdateDTO);
        return coursename;
    }
    @DeleteMapping(path = "/delete/{id}") //deletes according to the id
    public String deleteCourse(@PathVariable(value = "id")int id){

        boolean deleteCourse=courseService.deleteCourse(id);
        return "Course is deleted!";

    }

}
