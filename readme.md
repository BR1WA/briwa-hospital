# Briwa Hospital Management System

Briwa Hospital is a web-based hospital management system built with Java, Spring Boot, Thymeleaf, and Bootstrap. It provides secure user authentication, role-based access control, and essential features for managing patient data.

Features

🧑‍⚕️ Patient Management

Add, update, and delete patient records with attributes such as name, date of birth, illness indicator (boolean), and numeric score.

🔍 Search and Browse

All authenticated users can browse the paginated patient list and search by name.

🔐 Authentication & Security

Spring Security ensures protected access. Passwords are securely stored using BCrypt encryption.

📅 Role-Based Access Control (RBAC)

Two main roles: USER (read-only access) and ADMIN (full CRUD operations). Access is controlled via @PreAuthorize annotations.

🔹 Web User Interface

Built with Thymeleaf and Bootstrap for a responsive, user-friendly experience. Includes navbars, validated forms, tables, and confirmation prompts.



## Technologies Used

* Java
* HTML
* Java Swing (for GUI)
* JDBC (for database connection)
* MySQL (Database)

## Getting Started

### Prerequisites

* Java JDK 8 or higher
* MySQL Server
* An IDE such as IntelliJ IDEA or Eclipse

### Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/BR1WA/briwa-hospital.git
   ```

2. **Import the project** into your preferred IDE as a Java project.

3. **Set up the Database:**

   * Create a new MySQL database (e.g., `hospital_db`).
   * Import the provided SQL schema if available (check the repo for `.sql` files).
   * Update the database connection credentials in the Java code (look for JDBC URL, username, and password).

4. **Run the Application:**

   * Locate the main Java class (e.g., `Main.java`) and run it.

## Project Structure

```
/ briwa-hospital
|-- /src
|   |-- Main.java
|   |-- /views
|   |-- /controllers
|   |-- /models
|-- /resources
|-- README.md
```

## Screenshots

Below are some screenshots demonstrating the functionality of the Briwa Hospital Management System:

### 1. Login Interface

![Login Interface](screenshots/447354637-c5c04b77-9be7-4233-8b8e-e4c919730518.png)

### 2. Dashboard

![Dashboard](screenshots/447354672-b2abf0a4-f7ae-427a-ba9a-9d9e333fe503.png)

### 3. Patient list

![Patient list](screenshots/447354684-55669a22-1c3b-4ef8-8c11-798cfc98f875.png)

### 4. Patient search 

![Patient search](screenshots/447354678-7e3611f8-dd5b-496d-a348-bc392f54cb8d.png)

### 5. Patient Management

![Patient Management](screenshots/447354684-55669a22-1c3b-4ef8-8c11-798cfc98f875.png)


## Author

Created by [@BR1WA](https://github.com/BR1WA)
