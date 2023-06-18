# REST API using Spring Boot

This is a basic REST API project developed using the Spring Boot framework. It provides a foundation for building web applications and services that follow the REST architectural style.

## Features

- Exposes a set of RESTful endpoints to perform CRUD operations on data entities.
- Utilizes the Spring Data JPA library for easy database access and management.
- Implements the standard HTTP methods (GET, POST, PUT, DELETE) to handle different operations.
- Supports JSON as the data exchange format.

## Prerequisites

Before running the application, ensure you have the following prerequisites installed:

- Java Development Kit (JDK) 8 or higher
- Maven

## Installation

1. Clone the repository from GitHub:
  git clone https://github.com/SudarshanSirsi/Spring-boot-Rest-Api.git

2. Open Eclipse or Spring Tool Suite (STS).

3. Import the project into the IDE:

- Click on "File" -> "Import".
- Select "Existing Maven Projects" and click "Next".
- Browse to the project directory and click "Finish".

## Configuration

1. Open the `application.properties` file located in the `src/main/resources` directory.

2. Modify the following properties according to your database configuration:

- spring.datasource.url=jdbc:mysql://localhost:3306/your-database
- spring.datasource.username=your-username
- spring.datasource.password=your-password


You can change the database URL, username, and password to match your environment.

## Usage

1. Start the application by running the main class `RestapiApplication.java`.

2. Once the application is up and running, you can access the API endpoints using a tool like cURL or an API testing tool like Postman.

The base URL for the API is `http://localhost:8080`.

3. Use the available endpoints to perform CRUD operations on the data entities. Here are the basic endpoints:

- **GET** `/courses`: Retrieves all entities.
- **GET** `/courses/{id}`: Retrieves a specific entity by ID.
- **POST** `/courses`: Creates a new entity.
- **PUT** `/courses/{id}`: Updates an existing entity by ID.
- **DELETE** `/courses/{id}`: Deletes an entity by ID.

## Contributing

Contributions to this project are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request on the GitHub repository.






