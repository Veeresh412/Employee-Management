# Employee Management System 

A full-stack web application built to manage employee records. This project demonstrates a complete client-server architecture using a Spring Boot backend, a PostgreSQL database, and a responsive Vanilla HTML/CSS/JS frontend.

##  Technologies Used

### Backend
* **Java 17+**
* **Spring Boot** (REST API architecture)
* **Spring Data JPA & Hibernate** (Object-Relational Mapping)
* **PostgreSQL** (Relational Database)

### Frontend
* **HTML5** 
* **Vanilla CSS3** (Custom styling, Flexbox/Grid, Axis Bank brand colors)
* **Vanilla JavaScript** (Fetch API, Async/Await, DOM manipulation)

##  Features

* **Full CRUD Functionality:** Create, Read, Update, and Delete employee records.
* **RESTful API:** Clean API endpoints following REST conventions (`GET`, `POST`, `PUT`, `DELETE`).
* **File Uploads (Base64):** Supports uploading employee profile photos (.jpeg) and address proofs (.pdf/.jpeg) by converting them to Base64 strings for database storage.
* **Dynamic Edit Mode:** A single form intelligently switches between "Add" and "Update" modes using URL parameters to pre-fill data.
* **Interactive UI:** Features hover effects, clean tables, and responsive forms without relying on external CSS frameworks.

##  Project Structure

The project is divided into two main parts:

1. `/demo` - Contains the Spring Boot Java backend.
2. `/Frontend` - Contains the HTML, CSS, and JavaScript files.

### API Endpoints
| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/api/employees` | Fetch all employee records |
| `POST` | `/api/employees` | Create a new employee |
| `PUT` | `/api/employees/{id}` | Update an existing employee |
| `DELETE` | `/api/employees/{id}` | Delete an employee by ID |

##  How to Run Locally

### Prerequisites
* Java Development Kit (JDK) installed.
* PostgreSQL installed and running locally (`localhost:5432`).
* An IDE like VS Code, Eclipse, or IntelliJ.

### 1. Database Setup
1. Open pgAdmin.
2. Create a new database for the project (ensure your `application.properties` in Spring Boot matches this database name, username, and password).

### 2. Start the Backend
1. Open the `/demo` folder in your preferred Java IDE.
2. Locate the main application file (usually `DemoApplication.java`).
3. Click the **"Run Java"** or **"Play"** button provided by your IDE.
4. The Spring Boot server will start on `http://localhost:8080`. (Spring Data JPA will automatically connect to PostgreSQL and create the `employees` table for you!).

### 3. Start the Frontend
1. Navigate to the `/Frontend` folder.
2. Because the frontend uses standard HTML/JS, you can simply double-click `index.html` to open it in your web browser, or use an extension like VS Code Live Server for a better experience.
