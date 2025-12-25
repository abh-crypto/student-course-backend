-- ===============================
---------Course Table-------------
-- ===============================
CREATE TABLE `course` (
   `course_id` int NOT NULL AUTO INCREMENT,
   `course_code` varchar(61) NOT NULL,
   `course_duration` int NOT NULL,
   `course_name` varchar(46) NOT NULL,
   PRIMARY KEY (`course_id`)
 ) ENGINE=InnoDB
 DEFAULT CHARSET=utf8mb4
 COLLATE=utf8mb4_0900_ai_ci


-- ===============================
-------------Student Table--------
-- ===============================

CREATE TABLE `student` (
   `student_id` int NOT NULL AUTO INCREMENT,
   `student_name` varchar(46) NOT NULL,
   `student_email` varchar(61) NOT NULL,
   `course_id` int DEFAULT NULL,
   PRIMARY KEY (`student_id`),
   UNIQUE KEY `UKqm8ww2m2nj6rqaroqqelj9vl5` (`student_email`),
   KEY `FKdfypyqt0stgfc0aij9kcxm99s` (`course_id`),
   CONSTRAINT `FKdfypyqt0stgfc0aij9kcxm99s` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`)
 ) ENGINE=InnoDB
 DEFAULT CHARSET=utf8mb4
 COLLATE=utf8mb4_0900_ai_ci

