# ✅ TO-DO List Web Application

A full-stack **Task Management Web Application** built using **Spring Boot**, **Hibernate (JPA)**, **MySQL**, and **Thymeleaf**. This application allows users to manage daily tasks with complete CRUD functionality through a clean and responsive web interface.

---

<img width="1800" height="798" alt="Screenshot 2026-06-27 100310" src="https://github.com/user-attachments/assets/dabda062-663b-41e1-a15e-51d4a218b207" />


## 🚀 Features

* ➕ Add new tasks
* 📋 View all tasks
* ✏️ Update existing tasks
* ❌ Delete tasks
* ✅ Mark tasks as completed
* 📱 Responsive user interface
* 💾 Persistent data storage using MySQL

---

## 🛠️ Tech Stack

| Technology                  | Purpose                     |
| --------------------------- | --------------------------- |
| Java 17                     | Programming Language        |
| Spring Boot                 | Backend Framework           |
| Spring MVC                  | Request Handling            |
| Spring Data JPA (Hibernate) | ORM & Database Operations   |
| MySQL                       | Database                    |
| Thymeleaf                   | Server-side Template Engine |
| HTML5                       | Structure                   |
| CSS3                        | Styling                     |
| JavaScript                  | Client-side Interaction     |
| Maven                       | Dependency Management       |

---

## 📂 Project Structure

```
src
 ├── main
 │   ├── java
 │   │    ├── controller
 │   │    ├── entity
 │   │    ├── repository
 │   │    ├── service
 │   │    └── TodoApplication.java
 │   └── resources
 │        ├── templates
 │        ├── static
 │        └── application.properties
```

---

## ⚙️ Prerequisites

* Java 17+
* Maven 3.8+
* MySQL 8+

---

## 🗄️ Database Configuration

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Run the Project

Clone the repository

```bash
git clone https://github.com/prashantkumarkush/TO-DO-List-web-Apllication.git
```

Move into the project

```bash
cd TO-DO-List-web-Apllication
```

Build the project

```bash
mvn clean install
```

Run the application

```bash
mvn spring-boot:run
```

Open your browser

```
http://localhost:8080
```

---


## 📖 What I Learned

* Spring Boot Project Structure
* MVC Architecture
* CRUD Operations
* Spring Data JPA & Hibernate
* MySQL Database Integration
* Form Handling with Thymeleaf
* Exception Handling
* Maven Project Management

---

## 🔮 Future Improvements

* User Authentication (Spring Security)
* JWT Authentication
* REST API Version
* Task Categories
* Due Dates & Reminders
* Search & Filter Tasks
* Pagination
* Docker Deployment

---

## 👨‍💻 Author

**Prashant Kumar**

* Java Backend Developer
* GitHub: https://github.com/prashantkumarkush

---

⭐ If you found this project useful, consider giving it a star.
