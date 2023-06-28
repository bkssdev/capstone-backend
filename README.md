### The Capstone Project: Backend ###

This repository contains the Capstone Client Management API using Spring Boot. 

The REST API has CRUD endpoints which interacts with an H2 database. 

###  Starting the API ###

We can do this using the spring-boot-maven-plugin:

`mvn spring-boot:run`

Or  by running the `com.bkss.CapstoneClientManagementApp` via the IDE

###  Executing the API endpoints ###

You will be able to get all the existing client listing using rest client e.g. postman, using the HTTP GET

http://localhost:8080/clients

To get a specific client use the HTTP `GET`

http://localhost:8080/clients/{id}

The `Update` Client can be executed using the HTTP `PUT` and client json payload

http://localhost:8080/clients/{id}

The `Delete` Client can be executed using the HTTP `DELETE`, using the client id param

http://localhost:8080/clients/{id}

The `Create` Client can be executed using the HTTP `POST` and client json payload

http://localhost:8080/clients