# SpringBootBikeCRUD
"A Spring Boot project demonstrating CRUD operations on a 'Bike' entity. Utilizes Postman for API testing and MySQL as the database. Explore endpoints for adding, updating, deleting, and retrieving bike information. Ideal for learning Spring Boot, RESTful APIs, and MySQL integration."


Spring Boot Bike CRUD Operations Project
Welcome to the Spring Boot Bike CRUD Operations Project! This project serves as an ideal learning resource for those interested in understanding Spring Boot, RESTful APIs, and MySQL integration. It demonstrates basic CRUD (Create, Read, Update, Delete) operations on a 'Bike' entity. Additionally, Postman is utilized for API testing, and MySQL serves as the database.

Prerequisites
Before you start, ensure you have the following installed on your system:

Java Development Kit (JDK)
Maven
MySQL database
Postman (for testing the APIs)
Getting Started
Clone the Repository:

bash
Copy code
git clone https://github.com/Ravindragouda/spring-boot-bike-crud.git
cd spring-boot-bike-crud
Database Setup:

Create a MySQL database named bike_db.
Update the database configuration in src/main/resources/application.properties with your MySQL username and password.
Run the Application:

bash
Copy code
mvn spring-boot:run
Explore the Endpoints:
Open your browser and navigate to http://localhost:8080/swagger-ui.html to access the Swagger UI. Here, you can interact with and test the various CRUD operations.

API Endpoints
1. Get All Bikes
Endpoint: /api/bikes
Method: GET
Description: Retrieve a list of all bikes.
2. Get Bike by ID
Endpoint: /api/bikes/{id}
Method: GET
Description: Retrieve details of a specific bike by its ID.
3. Add a New Bike
Endpoint: /api/bikes
Method: POST
Description: Add a new bike to the database. Provide bike details in the request body.
4. Update Bike Information
Endpoint: /api/bikes/{id}
Method: PUT
Description: Update details of a specific bike by its ID. Provide updated bike details in the request body.
5. Delete Bike
Endpoint: /api/bikes/{id}
Method: DELETE
Description: Delete a bike from the database by its ID.
Testing with Postman
You can use Postman to test the CRUD operations. Import the provided Postman collection (postman/spring-boot-bike-crud.postman_collection.json) and start testing the endpoints.

Conclusion
Congratulations! You've successfully set up and explored the Spring Boot Bike CRUD Operations Project. This project serves as a foundation for understanding Spring Boot, RESTful APIs, and MySQL integration. 
