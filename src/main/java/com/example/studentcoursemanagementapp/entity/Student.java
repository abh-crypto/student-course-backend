package com.example.studentcoursemanagementapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id",length = 11 ,nullable=false)
     private int studentid;

    @Column(name="student_name",length=46 ,nullable = false)
     private String studentname;

    @Column(name="student_email",length=61 ,unique = true)
     private String studentemail;

    @ManyToOne
    @JoinColumn(name="course_id")
     private Course course;

    public Student() {
    }

    public Student(int studentid, String studentname, String studentemail, Course course) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentemail = studentemail;
        this.course = course;
    }

    public Student(String studentname, String studentemail, Course course) {
        this.studentname = studentname;
        this.studentemail = studentemail;
        this.course = course;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", studentemail='" + studentemail + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
