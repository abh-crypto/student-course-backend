package com.example.studentcoursemanagementapp.repo;

import com.example.studentcoursemanagementapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
