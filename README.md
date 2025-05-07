# Online Examination System

A console-based Java application that simulates an online examination system with roles such as Admin, Instructor, and Student.

## 🛠 Features
- Admin can manage courses, topics, and users.
- Instructors can create exams and questions.
- Students can take exams and view results.
- Uses Hibernate for ORM and MySQL (or any JDBC-supported DB).

## 🧰 Tech Stack
- Java
- Hibernate
- Maven
- MySQL (or configurable database)
- Console-based UI

## 📂 Project Structure
- `src/main/java/com.exam` — Core logic and menus.
- `dao/` — Data access layer using Hibernate.
- `hibernate.cfg.xml` — Hibernate configuration.
- `pom.xml` — Maven dependencies.

## 🚀 How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/Aishwarya-Birajdar/Online_Examination_System.git
   cd Online_Examination_System
   ```

2. Configure your `hibernate.cfg.xml` with your DB credentials.

3. Compile and run:
   ```bash
   mvn compile
   mvn exec:java -Dexec.mainClass="com.exam.Main"
   ```

## 📌 Notes
- Ensure MySQL DB is running and configured correctly.
- You may need to set up the schema manually or provide a SQL script.

## 📄 License
MIT License (or specify your own).
