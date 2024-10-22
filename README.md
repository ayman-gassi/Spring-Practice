# Spring Practice

## Description
This repository contains various practice projects focused on learning and applying core Spring Framework concepts, including Spring Data JPA, H2 in-memory database, Hibernate ORM, and Lombok annotations. The aim is to build a deeper understanding of how these tools integrate to streamline Java application development.

## Technologies Used
- **Spring Framework**: For building the web application using Java.
- **Spring Data JPA**: Simplifies the implementation of data access layers by providing a repository abstraction.
- **Hibernate**: As an ORM tool for mapping Java objects to relational database tables.
- **H2 Database**: In-memory database for development and testing purposes.
- **Lombok**: To reduce boilerplate code such as getters, setters, and constructors.

## Key Features
- Practice with **Spring Boot** to create and run standalone Spring applications.
- **CRUD operations** using **Spring Data JPA** with H2 as the database.
- Configuring and mapping entities using **Hibernate** and **JPA** annotations.
- Utilizing **Lombok** annotations to streamline the creation of data models.
- Testing with an **in-memory H2 database** for quick feedback and ease of use during development.

## Getting Started

### Prerequisites
To build and run the project, you will need:
- JDK 8 or later
- Maven
- An IDE (such as IntelliJ IDEA or Eclipse)

### Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/ayman-gassi/Spring-Practice.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Spring-Practice
    ```
## Project Structure
- `src/main/java`: Contains Java source files.
  - `entities/`: Domain models or entities with JPA and Lombok annotations.
  - `repositories/`: Spring Data JPA repositories for accessing the database.
  - `services/`: Business logic layer.
  - `controllers/`: RESTful web controllers for handling HTTP requests.
  
- `src/main/resources`: Contains the configuration files.
  - `application.properties`: Configuration for Spring, JPA, and H2.
