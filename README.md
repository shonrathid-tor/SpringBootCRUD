# 📚 Spring Boot CRUD API

A simple Java Spring Boot project that provides a RESTful CRUD API for managing books.

---

## 🔧 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL (or H2 for testing)
- Maven
- Lombok
- Postman (for testing APIs)

---

## 📁 Project Structure


src/
└── main/
├── java/
│ └── com.example.crud/
│ ├── controller/
│ ├── entity/
│ ├── repository/
│ └── CrudApplication.java
└── resources/
├── application.properties


---

## 🚀 Features

- Create, Read, Update, and Delete (`CRUD`) operations for books
- RESTful API design
- JSON request/response
- Auto-database mapping using Spring Data JPA

---

## 🧪 API Endpoints

| Method | Endpoint          | Description            |
|--------|-------------------|------------------------|
| GET    | `/books`          | Get all books          |
| GET    | `/books/{id}`     | Get book by ID         |
| POST   | `/books`          | Add new book           |
| PUT    | `/books/{id}`     | Update existing book   |
| DELETE | `/books/{id}`     | Delete book by ID      |

### 🧾 Sample JSON Request (POST /books)

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "price": 39.99
}

