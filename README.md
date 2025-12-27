# Online Examination System (Java + JDBC)

A console-based Online Examination System developed using Java, Object-Oriented Programming (OOP), JDBC, and MySQL.  
The system allows users to log in, attempt a timed examination, and store results in a database.

This project is suitable for academic submission, GitHub portfolio, and interview demonstration.

---

## Features

- User authentication (login system)
- Dynamic loading of questions from database
- Multiple-choice questions (MCQs)
- Timed examination
- Automatic score calculation
- Result storage in MySQL database
- File handling for exam instructions

---

## Technologies Used

- Programming Language: Java  
- Concepts: Object-Oriented Programming (OOP)  
- Database: MySQL  
- Connectivity: JDBC  
- File Handling: Java IO  
- Tools: Git, GitHub  

---

## Project Structure

Online_Exam_System/
│
├── files/
│ └── instructions.txt
│
├── lib/
│ └── mysql-connector-j-9.5.0.jar
│
└── src/
├── dao/
│ ├── DBConnection.java
│ ├── UserDAO.java
│ ├── QuestionDAO.java
│ └── ResultDAO.java
│
├── model/
│ ├── User.java
│ ├── Question.java
│ └── Result.java
│
├── service/
│ └── ExamService.java
│
└── Main.java

yaml
Copy code

---

## Database Setup

### Create Database
```sql
CREATE DATABASE online_exam;
USE online_exam;
Create Tables
sql
Copy code
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50)
);

CREATE TABLE questions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question TEXT,
    option_a VARCHAR(100),
    option_b VARCHAR(100),
    option_c VARCHAR(100),
    option_d VARCHAR(100),
    correct_option CHAR(1)
);

CREATE TABLE results (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    score INT
);
How to Run the Project
Prerequisites
JDK 8 or above

MySQL installed and running

MySQL Connector/J (JDBC driver)

Configure Database Connection
Update database credentials in:

bash
Copy code
src/dao/DBConnection.java
java
Copy code
jdbc:mysql://localhost:3306/online_exam
username: root
password: YOUR_MYSQL_PASSWORD
Compile the Project
From the project root directory:

bash
Copy code
javac -cp "lib/mysql-connector-j-9.5.0.jar;src" src/dao/*.java src/model/*.java src/service/*.java src/Main.java
Run the Project
bash
Copy code
java -cp "lib/mysql-connector-j-9.5.0.jar;src" Main
Sample Login
Insert a user into the database:

sql
Copy code
INSERT INTO users (username, password)
VALUES ('sandhya', '1234');
Login using:

yaml
Copy code
Username: sandhya
Password: 1234
Output
Questions are displayed one by one

User selects answers using A/B/C/D

Final score is displayed

Score is saved in the database

Learning Outcomes
Practical implementation of JDBC

Database-driven Java application

File handling in Java

Modular and layered project structure

Debugging real runtime errors

Author
Sandhya Kumari
B.Tech Computer Science and Engineering

GitHub: https://github.com/Sandhya46-ux

Note
Database credentials are not included for security reasons.
Please update them locally before running the project.

yaml
Copy code

---

### After pasting
Run these commands to push it:

```bash
git add README.md
git commit -m "Add README for Online Examination System"
git push
