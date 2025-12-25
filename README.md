//////******Student-Course-Management-App******/////////// 

## Project Overview

This is a Spring Boot backend application for managing students and their associated courses.
The project demonstrates backend development, REST APIs, JPA/Hibernate, and SQL database design skills.

Each student is linked to a course using a foreign key relationship.

## Tech Stack
Java 17
Spring Boot
Spring Data JPA (Hibernate)
MySQL
Maven
Postman (API Testing)
IntelliJ IDEA Community Edition

### 📁 Project Structure
```text
student-course-backend
├── src
│   └── main
│       ├── java
│       │   ├── controller
│       │   ├── service
│       │   ├── repo
│       │   ├── entity
│       │   └── dto
│       │
│       └── resources
│           ├── application.properties
│           └── sql
│               └── schema.sql
│
├── pom.xml
└── README.md

```text
## Setup & Run Instructions
1.Prerequisites
Make sure you have:
->Java 17+
->MySQL Server
->Maven
->IntelliJ IDEA (Community Edition)

2.Create Database
Open MySQL Workbench and run: CREATE DATABASE studentcoursedb;

3.Configure Database
Below is the database configuration used for this project:
/DatabaseScreenshots
        ├── db-configuration.png
        ├── course-table.png
        ├── student-table.png

4.Run the Application
 Using Intellij:
    i.Open the project
    ii.Locate the main SpringBoot class
    iii.Run it
 Or Using the Maven: mvn spring-boot:run
 Application will run on: http://localhost:8084

## Database Schema
 You view the course table and student table in the :
        i.Database Screenshots/course-table.png.
        ii.Database Screenshots/student-table.png.


## SQL Scripts
 All SQL Scripts are included in the project under: src/main/resources/sql/
    Includes:
        i.Database schema creation
        ii.Foreign key relationships

## API Endpoints
Base URL: http://localhost:8084/api/v1

//**1.Course APIs**//
1️.Add Course :POST /course/save
  Request Body:
   {
     "coursename": "Spring Security",
     "coursecode": "AS235",
     "courseduration": 4
   }
2️.Get All Courses : GET /course/getAllCourses
3.Get Course By ID :GET /course/{courseId}

//**2.Student APIs**//
1.Add Student with Course:POST /student/save
  Request Body:
   {
     "studentname": "Vinit",
     "studentemail": "vinit@gmail.com",
     "course": {
        "courseid": 5
     }
   }
2.Get All Students:GET /student/getAllStudents
3.Update Student Details:PUT /student/update
4.Delete Student :DELETE /student/delete/{studentId}

## API Testing (Postman)
All REST APIs were tested using **Postman** to ensure correct functionality.
### HTTP Methods Tested
- POST
- GET
- PUT
- DELETE

Successful API responses and database persistence were verified using **MySQL**.

### Test Evidence
Postman testing screenshots demonstrating request bodies and successful responses
are included in the **API Tested Screenshots** folder.

## Output Demonstration
✔ Successful API execution in Postman
✔ Data persisted in MySQL database
✔ Foreign key relationship verified.

## SQL Scripts
All SQL scripts are included in: src/main/resources/sql/schema.sql

## Future Enhancements
 i.Pagination & sorting
 ii.Swagger API documentation

//****Author****//
 Abhishek Sargam
 Backend Developer | Java | Spring Boot | MySQL

        
