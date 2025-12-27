# Online Examination System (Java + JDBC)

A console-based **Online Examination System** developed using **Java**, **Object-Oriented Programming (OOP)**, **JDBC**, and **MySQL**.  
The system allows users to log in, attempt a timed examination, and store results in a database.

This project demonstrates real-world usage of Java with database connectivity and is suitable for **academic submission, GitHub portfolio, and interviews**.

---

## 📌 Features

- User authentication (login system)
- Dynamic loading of questions from database
- Multiple-choice questions (MCQs)
- Timed examination
- Automatic score calculation
- Result storage in MySQL database
- File handling for exam instructions

---

## 🛠️ Technologies Used

- **Programming Language:** Java  
- **Concepts:** OOP (Encapsulation, Modularity)  
- **Database:** MySQL  
- **Connectivity:** JDBC  
- **File Handling:** Java IO  
- **Tools:** Git, GitHub  

---

## 📂 Project Structure

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


---

## 🗄️ Database Schema

### Database
```sql
CREATE DATABASE online_exam;
USE online_exam;
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
1️⃣ Prerequisites

JDK 8 or above

MySQL installed and running

MySQL Connector/J (JDBC driver)

Configure Database Connection

Update credentials in:

src/dao/DBConnection.java

return DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/online_exam",
    "root",
    "YOUR_MYSQL_PASSWORD"
);

>>Compile the Project

From project root:
                javac -cp "lib/mysql-connector-j-9.5.0.jar;src" src/dao/*.java src/model/*.java src/service/*.java src/Main.java
Run the project:
               java -cp "lib/mysql-connector-j-9.5.0.jar;src" Main

Sample Login

Insert a test user in MySQL:

INSERT INTO users (username, password)
VALUES ('sandhya', '1234');

Run program and login with:
               Username: sandhya
               Password: 1234

