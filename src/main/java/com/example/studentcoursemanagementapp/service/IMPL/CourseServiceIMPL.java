package com.example.studentcoursemanagementapp.service.IMPL;


import com.example.studentcoursemanagementapp.dto.CourseDTO;
import com.example.studentcoursemanagementapp.dto.CourseSaveDTO;
import com.example.studentcoursemanagementapp.dto.CourseUpdateDTO;
import com.example.studentcoursemanagementapp.entity.Course;
import com.example.studentcoursemanagementapp.entity.Student;
import com.example.studentcoursemanagementapp.repo.CourseRepo;
import com.example.studentcoursemanagementapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceIMPL implements CourseService {


    @Autowired
    private CourseRepo courseRepo;


    @Override
    public String addCourse(CourseSaveDTO courseSaveDTO) {
        Course course=new Course(

                courseSaveDTO.getCoursename(),
                courseSaveDTO.getCoursecode(),
                courseSaveDTO.getCourseduration()

        );


        courseRepo.save(course);
        return "Course added successfully";//passes to postman output screen
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        List<Course> getCourses=courseRepo.findAll();
        List<CourseDTO> courseDTOList=new ArrayList<>();

        for(Course course:getCourses){
            CourseDTO courseDTO=new CourseDTO(
                    course.getCourseid(),
                    course.getCoursename(),
                    course.getCoursecode(),
                    course.getCourseduration()

            );
            courseDTOList.add(courseDTO);

        }
        return courseDTOList;
    }

    @Override
    public String updateCourse(CourseUpdateDTO courseUpdateDTO) {
        if(courseRepo.existsById(courseUpdateDTO.getCourseid())){
            Course course=courseRepo.getById(courseUpdateDTO.getCourseid());
            course.setCoursename(courseUpdateDTO.getCoursename());
            course.setCoursecode(courseUpdateDTO.getCoursecode());
            course.setCourseduration(courseUpdateDTO.getCourseduration());
            courseRepo.save(course);
            return course.getCoursename();
        }
        else{
            System.out.println("Course Id is not found");
        }
        return null;

    }

    @Override
    public boolean deleteCourse(int id) {
        if(courseRepo.existsById(id)){
            courseRepo.deleteById(id);
        }
        else{
            System.out.println("Following Course Id is not found");
        }
        return false;
    }

    @Override
    public Course getCourseById(int courseid) {
        return courseRepo.findById(courseid)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }
}
