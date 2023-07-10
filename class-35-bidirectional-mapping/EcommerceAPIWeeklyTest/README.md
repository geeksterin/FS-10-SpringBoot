<h1 align = "center"> Ecommerce API </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
This is a backend API built using the Spring framework that handles various HTTP requests for an Ecommerce domain. The API allows users to create accounts, add products, create orders and manage addresses

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.url=jdbc:mysql://localhost:3306/<databasename>
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
<br>

* User Model
```
userId:integer
userName:string
userEmail:string
userPassword:string
userPhoneNumber:string
```

* Product Model
```
productId:integer 
productName:string
productPrice:integer
productDescription:string
productCategory:string
productBrand:string
```
* Address Model
```
addressId:integer    
addressName:string
landmark:string
phoneNumber:string
zipcode:string
state:string
userId : foreign key mapping
```
* Order Model
```
orderId:integer
userId:integer (foreign key mapping)
productId:integer(foreign key mapping)
addressId:integer(foreign key mapping)
productQuantity:integer
```

## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points 

The following endpoints are available in the API:

```
/users (POST): Create a new user
/users (GET): Get user by user ID (request param)
/products (POST): Add a new product
/products (GET): Get all products (request param is null)
/products/{id} (DELETE): Delete a product by product ID (path variable)
/products (GET): Get products based on category (request param)
/address (POST): Create a new address
/orders (POST): Place a new order
/orders : Get an order by order ID (request param)
/orders/{id} (DELETE) : Delete a order by order ID (path variable)
```
<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

This API provides basic functionality for an Ecommerce platform, allowing users to create accounts, add products, create orders and manage addresses. 
The project can be extended to include additional features as required.


## Author

👤 **Ajinkya Padule**

* GitHub: [AjinkyaPersonal](https://github.com/AjinkyaPersonal)

* LinkedIn: [Ajinkya Padule](https://www.linkedin.com/in/ajinkya-padule-04b8541a6/)
    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [Ajinkya Padule](https://github.com/AjinkyaPersonal).<br />

This project is [MIT]("url") licensed.
    
---
