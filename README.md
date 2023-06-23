### The Capstone Project: Backend ###

This repository contains the Capstone Client Management API using Spring Boot. 

The REST API has CRUD endpoints which interacts with an H2 database. 

###  Starting Our API
We can do this using the spring-boot-maven-plugin:

mvn spring-boot:run

Or  by running the `com.bkss.CapstoneClientManagementApp` via the IDE

You will be able to get the existing client listing using rest client e.g. postman:

http://localhost:8080/clients.

