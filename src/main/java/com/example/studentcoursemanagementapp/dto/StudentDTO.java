package com.example.studentcoursemanagementapp.dto;


import com.example.studentcoursemanagementapp.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor //for constructor with parameters present in Student.java
@NoArgsConstructor  //for constructor with no parameters present in Student.java
@Data  //data we receive from the Student.java
public class StudentDTO {
    private int studentid;

    private String studentname;

    private String studentemail;

    private Course course;
}
