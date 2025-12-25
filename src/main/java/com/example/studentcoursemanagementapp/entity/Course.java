package com.example.studentcoursemanagementapp.entity;


import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="course_id",length = 11)
    private int courseid;

    @Column(name="course_name",length=46, nullable = false)
    private String coursename;

    @Column(name="course_code",length=61, nullable = false, unique=true)
    private String coursecode;

    @Column(name="course_duration" ,length=12, nullable = false)
    private Integer courseduration;

    public Course(int courseid, String coursename, String coursecode, Integer courseduration) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursecode = coursecode;
        this.courseduration = courseduration;
    }

    public Course(String coursename, String coursecode, Integer courseduration) {
        this.coursename = coursename;
        this.coursecode = coursecode;
        this.courseduration = courseduration;
    }

    public Course() {
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public Integer getCourseduration() {
        return courseduration;
    }

    public void setCourseduration(Integer courseduration) {
        this.courseduration = courseduration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", coursename='" + coursename + '\'' +
                ", coursecode='" + coursecode + '\'' +
                ", courseduration='" + courseduration + '\'' +
                '}';
    }
}
