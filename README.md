# 📚 Student-Course-Backend

## Project Overview

This is a Spring Boot backend application for managing students and their associated courses.
The project demonstrates backend development, REST APIs, JPA/Hibernate, and SQL database design skills.

Each student is linked to a course using a foreign key relationship.

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Postman (API Testing)
- IntelliJ IDEA Community Edition

### 📁 Project Structure
```
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

```
## 🚀 Setup & Run Instructions

   ### Prerequisites
- Java 17+
- MySQL Server
- Maven
- IntelliJ IDEA (Community Edition)

### 1️⃣ Create Database
 - Open MySQL Workbench and run:
    ```
     CREATE DATABASE studentcoursedb;
     ```

### 2️⃣ Configure Database
 - Below screenshots show the database configuration used in this project:
   ```
   DatabaseScreenshots
        ├── db-configuration.png
        ├── course-table.png
        └── student-table.png
    ```

### ➡️ Update database credentials in:
     src/main/resources/application.properties

### 3️⃣ Run the Application
   ▶ Using IntelliJ IDEA:
   - Open the project in IntelliJ IDEA
   - Locate the main Spring Boot Application class
   - Click Run
     
   ▶ Using Maven
   mvn spring-boot: run

## 🌐 Application URL
   - Once started, the application will run on: http://localhost:8084

## 🛢 Database Schema
  #### You view the course table and student table in the :
   - Database Screenshots/course-table.png.
   - Database Screenshots/student-table.png.


## 🗄 SQL Scripts
 ### All SQL Scripts are included in the project under:
 ```
 src/main/resources/sql/
 ```
#### Includes:
   - Database schema creation
   - Foreign key relationships

## 📌 API Endpoints
#### Base URL: http://localhost:8084/api/v1

#### 🎓 Course APIs
####  ➕ Add Course : POST /course/save
  - Request Body
    ```json

    {
      "coursename": "Spring Security",
      "coursecode": "AS235",
      "courseduration": 4
    }
   
#### 📄 Get All Courses
#### 🔍 Get Course By ID: GET /course/{courseId}

#### 👨‍🎓 Student APIs
#### ➕ Add Student with Course: POST /student/save
  - Request Body
      ```json     
       {
          "studentname": "Vinit",
          "studentemail": "vinit@gmail.com",
          "course": {
              "courseid": 5
                  }
      }

#### 📄 Get All Students: GET /student/getAllStudents
#### ✏ Update Student Details: PUT /student/update
#### ❌ Delete Student: DELETE /student/delete/{studentId}

## 🧪 API Testing (Postman)
  - All REST APIs were tested using Postman to ensure correct functionality.

#### ✅ HTTP Methods Tested
       POST
       GET
       PUT
       DELETE

  ✔ Successful API responses &nbsp;&nbsp;
  ✔ Data persistence verified in MySQL

## 📸 Test Evidence
 - Postman testing screenshots showing request bodies and successful responses are included in the:
   API Tested Screenshots folder.

## 📊 Output Demonstration
 ✔ Successful API execution in Postman
 ✔ Data persisted in MySQL database
 ✔ Foreign key relationship verified.

## 🚀 Future Enhancements
  - Pagination & Sorting
  - Swagger API Documentation

## 👤 Author
Abhishek Sargam
Backend Developer | Java | Spring Boot | MySQL
        
