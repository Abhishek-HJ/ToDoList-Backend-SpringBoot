📌 ToDo List Backend – Spring Boot

A simple RESTful backend API for managing tasks in a ToDo List application, built with Spring Boot.
This project demonstrates CRUD operations, clean architecture, and modular service-layer design.

🚀 Features

✅ Create a new task

📋 Retrieve all tasks

🔍 Get task by ID

✏️ Update an existing task

❌ Delete a task

📡 Proper HTTP responses with ResponseEntity

🛠 Tech Stack

Java 17+

Spring Boot (Web, JPA, Validation)

MySQL  (configurable database)

Maven (build tool)

Lombok (optional, for cleaner code)

📂 Project Structure
src/main/java/com/exampleTodo/ToDo/
│
├── controller/    # REST Controllers (TaskController.java)
├── model/         # Entity classes (Task.java)
├── repository/    # JPA Repositories
├── service/       # Business logic (TaskService.java)
└── ToDoApplication.java

⚡ API Endpoints
Method	Endpoint	Description
GET	/api/tasks	Get all tasks
GET	/api/tasks/{id}	Get task by ID
POST	/api/tasks	Create new task
PUT	/api/tasks/{id}	Update task
DELETE	/api/tasks/{id}	Delete task

📌 Example Request (POST):

{
  "title": "Finish Spring Boot Project",
  "description": "Complete ToDo backend and push to GitHub",
  "completed": false
}


📌 Example Response (GET /api/tasks):

[
  {
    "id": 1,
    "title": "Finish Spring Boot Project",
    "description": "Complete ToDo backend and push to GitHub",
    "completed": false
  }
]

📮 API Testing

All endpoints tested using Postman or HTTP client.


Example:

Start server: mvn spring-boot:run

Test GET all tasks: GET http://localhost:8080/api/tasks

▶️ Run Locally

Clone the repo

git clone https://github.com/your-username/todolist-springboot.git
cd todolist-springboot


Configure DB in application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


Run the app

mvn spring-boot:run


Test API at http://localhost:8080/api/tasks

