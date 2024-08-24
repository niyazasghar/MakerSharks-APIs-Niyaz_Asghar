# Makersharks Supplier Search API

This repository contains the implementation of a RESTful API built using Spring Boot for Makersharks. It allows buyers to search for manufacturers based on their customized requirements such as location, nature of business, and manufacturing processes.

## Features

* Search for manufacturers by location, business scale, and manufacturing capabilities.
* Paginated responses for large result sets.
* Input validation and error handling.
* (Optional) API documentation using Swagger.

## Prerequisites

To run this application, you will need:

* JDK 11 or later
* Maven 3.6 or later
* An IDE like IntelliJ IDEA or Visual Studio Code
* MySQL Database (recommended, but H2 in-memory database can also be used for testing purposes)

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/makersharks-api.git
   cd makersharks-api
   ```
2. Configure the `application.properties` file with the appropriate database settings:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/makersharks
   spring.datasource.username=mysql
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

## Usage

### Search Manufacturers

To search for manufacturers based on specified criteria, use the following POST request:

curl -X POST http://localhost:8080/api/supplier/query \
-H 'Content-Type: application/json' \
-d '{
  "location": "India",
  "natureOfBusiness": "SMALL_SCALE",
  "manufacturingProcesses": ["THREE_D_PRINTING"],
  "page": 0,
  "size": 10
}'
### API Response

The API will return a paginated list of suppliers matching the search criteria, including details such as supplier\_id, company\_name, website, and more.

## Security

This project implements basic security best practices. (Here, you might want to elaborate on any specific security implementations or simply note that this is a POC and full security implementations are a TODO.)

## Exception Handling

Global exception handling is in place to manage input validation errors and other common issues gracefully.

## Unit Tests

(Optional) Unit tests for various components of the application are available in the `src/test` directory. Run them using Maven:

```bash
mvn test
```
## Documentation

(Optional) For detailed API documentation, navigate to `http://localhost:8080/swagger-ui.html` after starting the application.

## Contributing

Contributions to this project are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is open-sourced under the MIT License. See the `LICENSE` file for more information.
