package com.example.studentcoursemanagementapp.service.IMPL;

import com.example.studentcoursemanagementapp.dto.StudentDTO;
import com.example.studentcoursemanagementapp.dto.StudentSaveDTO;
import com.example.studentcoursemanagementapp.dto.StudentUpdateDTO;
import com.example.studentcoursemanagementapp.entity.Course;
import com.example.studentcoursemanagementapp.entity.Student;
import com.example.studentcoursemanagementapp.repo.CourseRepo;
import com.example.studentcoursemanagementapp.repo.StudentRepo;
import com.example.studentcoursemanagementapp.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {

   @Autowired
   private StudentRepo studentRepo;


    @Override
    @Transactional
    public String addStudent(StudentSaveDTO studentSaveDTO){



        Student student=new Student(
                studentSaveDTO.getStudentname(),
                studentSaveDTO.getStudentemail(),
                studentSaveDTO.getCourse());


        studentRepo.save(student);
        return "Student with course added successfully";
    }

    @Override
    public List<StudentDTO> getAllStudents() {

        List<Student> getStudents=studentRepo.findAll();
        List<StudentDTO> studentDTOList=new ArrayList<>();

        for(Student student:getStudents){
            StudentDTO studentDTO=new StudentDTO(
                    student.getStudentid(),
                    student.getStudentname(),
                    student.getStudentemail(),
                    student.getCourse()

            );
            studentDTOList.add(studentDTO);

        }
        return studentDTOList;
    }

    @Override
    public String updateStudent(StudentUpdateDTO studentUpdateDTO) {
        if(studentRepo.existsById(studentUpdateDTO.getStudentid())){
            Student student=studentRepo.getById(studentUpdateDTO.getStudentid());
            student.setStudentname(studentUpdateDTO.getStudentname());
            student.setStudentemail(studentUpdateDTO.getStudentemail());
            student.setCourse(studentUpdateDTO.getCourse());
            studentRepo.save(student);
            return "Updation Successful";
        }
        else{
            System.out.println("Student Id is not found");
        }
        return null;
    }

    @Override
    public boolean deleteStudent(int id) {

        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
        }
        else{
            System.out.println("Following Student Id is not found");
        }





        return false;
    }
}
