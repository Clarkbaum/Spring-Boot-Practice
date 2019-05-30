-- DROP TABLE students;
-- DROP TABLE students_course;
-- DROP TABLE course;
-- DROP TABLE course_step;
-- DROP TABLE step;

CREATE TABLE students (
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(500) NOT NULL,
	description VARCHAR(500)
);

CREATE TABLE students_course (
	studentId INT(6) NOT NULL,
	courseId INT(6) NOT NULL,
	PRIMARY KEY (`studentId`, `courseId`)
);

CREATE TABLE course (
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(500) NOT NULL,
	description VARCHAR(500)
);

CREATE TABLE course_step (
	courseId INT(6) NOT NULL,
	stepId int(6) NOT NULL,
	PRIMARY KEY (`courseId`, `stepId`)
);

CREATE TABLE step (
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	description VARCHAR(500) 
);