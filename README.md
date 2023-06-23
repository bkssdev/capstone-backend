### The Capstone Project:

This repository contains the BKSS Client Management CRUD application using Spring Boot and ReactJs. 

We have created some REST API endpoints to interact with our H2 database. 

We also created some React components to fetch and write data using our API endpoints. 

We also packaged our Spring Boot Application with our React UI into a single application package.

###  Starting Our API
We can do this using the spring-boot-maven-plugin:

mvn spring-boot:run

Then we'll be able to get our clients list by going to via our rest client e.g. postman:

http://localhost:8080/clients.

Now we're ready to start our frontend application by cd'ing  to the frontend folder and running:

npm start

When accessing http://localhost:3000 in our browser, we should see the React sample page:



