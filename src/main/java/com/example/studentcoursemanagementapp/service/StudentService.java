package com.example.studentcoursemanagementapp.service;

import com.example.studentcoursemanagementapp.dto.StudentDTO;
import com.example.studentcoursemanagementapp.dto.StudentSaveDTO;
import com.example.studentcoursemanagementapp.dto.StudentUpdateDTO;

import java.util.List;

public interface StudentService {
    String addStudent(StudentSaveDTO studentSaveDTO);

    List<StudentDTO> getAllStudents();

    String updateStudent(StudentUpdateDTO studentUpdateDTO);


    boolean deleteStudent(int id);
}
