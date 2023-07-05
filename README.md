### The Capstone Project: Backend ###

This repository contains the Capstone Client Management API using Spring Boot. 

The REST API has CRUD endpoints which interacts with an H2 database. 

###  Pre-requisite ###
1. Install Maven

    https://phoenixnap.com/kb/install-maven-windows

   https://mkyong.com/maven/install-maven-on-mac-osx/
2. Install Java 19 or Later

    https://thejavaguy.org/posts/015-how-to-install-jdk-19-on-windows/

    https://thejavaguy.org/posts/014-how-to-install-jdk-19-on-macos/

### Confirm successful installation of Maven and Java as follows:
    mvn -version
    java -version

###  Starting the API ###

We can do this using the spring-boot-maven-plugin:

`mvn spring-boot:run`

Or  by running the `com.bkss.CapstoneClientManagementApp` via the IDE

###  Executing the API endpoints using Postman or any rest client ###

1. You will be able to get all the existing client listing using the HTTP GET

   #### URI `http://localhost:8080/clients`


2. To get a specific client use the HTTP `GET` and the following endpoint URI:

    #### URI `http://localhost:8080/clients/{id}`


3. The `Create` Client can be executed using the HTTP `POST`, and the following endpoint URI and request json payload
    #### URI `http://localhost:8080/clients`

    #### Payload

        {
            "name": "Henry 1234",
            "email": "henrydgung.com1"
        }


4. The `Update` Client can be executed using the HTTP `PUT`, specifying the client id param and request json payload

   #### URI `http://localhost:8080/clients/{id}`

   #### Payload

        {
            "name": "Henry 1234",
            "email": "henrydgung.com1"
        }

5. The `Delete` Client can be executed using the HTTP `DELETE` and specifying the client id param

   #### URI ` http://localhost:8080/clients/{id}`

