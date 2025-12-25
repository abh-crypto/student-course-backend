package com.example.studentcoursemanagementapp.repo;

import com.example.studentcoursemanagementapp.entity.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
