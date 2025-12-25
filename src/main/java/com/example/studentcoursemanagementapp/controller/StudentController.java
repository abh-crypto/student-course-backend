package com.example.studentcoursemanagementapp.controller;


import com.example.studentcoursemanagementapp.dto.StudentDTO;
import com.example.studentcoursemanagementapp.dto.StudentSaveDTO;
import com.example.studentcoursemanagementapp.dto.StudentUpdateDTO;
import com.example.studentcoursemanagementapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //handles the rest apis
@CrossOrigin //handles the database and communicates with the frontend
@RequestMapping("api/v1/student")
public class StudentController {



    @Autowired
    private StudentService studentService;

    @PostMapping(path = "/save")
    public String saveStudent(@RequestBody StudentSaveDTO studentSaveDTO){

        String stname = studentService.addStudent(studentSaveDTO);
        return stname;
    }
    @GetMapping("/getAllStudents")
    public List<StudentDTO> getAllStudents(){
        List<StudentDTO> allStudents=studentService.getAllStudents();
        return allStudents;
    }
    @PutMapping(path = "/update")
    public String updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO){

        String stname = studentService.updateStudent(studentUpdateDTO);
        return stname;
    }
    @DeleteMapping(path = "/delete/{id}") //deletes according to the id
    public String deleteStudent(@PathVariable(value = "id")int id){

        boolean deleteStudent=studentService.deleteStudent(id);
        return "its deleted!";

    }
}
