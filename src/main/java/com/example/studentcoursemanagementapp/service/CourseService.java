package com.example.studentcoursemanagementapp.service;

import com.example.studentcoursemanagementapp.dto.CourseDTO;
import com.example.studentcoursemanagementapp.dto.CourseSaveDTO;
import com.example.studentcoursemanagementapp.dto.CourseUpdateDTO;
import com.example.studentcoursemanagementapp.entity.Course;

import java.util.List;

public interface CourseService {

    String addCourse(CourseSaveDTO courseSaveDTO);

    List<CourseDTO> getAllCourses();

    String updateCourse(CourseUpdateDTO courseUpdateDTO);

    boolean deleteCourse(int id);

    Course getCourseById(int courseId);
}
