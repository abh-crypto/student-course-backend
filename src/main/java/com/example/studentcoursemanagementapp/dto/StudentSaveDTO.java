package com.example.studentcoursemanagementapp.dto;


import com.example.studentcoursemanagementapp.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentSaveDTO {

    private String studentname;

    private String studentemail;

    private Course course;



}
