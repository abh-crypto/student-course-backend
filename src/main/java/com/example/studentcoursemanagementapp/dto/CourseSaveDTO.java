package com.example.studentcoursemanagementapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor //for constructor with parameters present in Student.java
@NoArgsConstructor  //for constructor with no parameters present in Student.java
@Data  //data we receive from the Student.java
public class CourseSaveDTO {

    private String coursename;


    private String coursecode;


    private Integer courseduration;
}
