

# Full Stack Bus Route Management System

This is a Full Stack Web Application that can be used for Finding optimized route managemtn system which is fully optmized to give you cost and time saving output


# Tech Stack of this Application
Front-End : HTML, CSS, JavaScript
Back-End : JAVA Spring-Boot, Apache Maven

# For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Code Summary

+ In Front-End part log_in.HTML is the main & first starting file
+ After successful log authentication user is redirected to index.HTML
+ According to Admin Requirements there are many funcitionalities to use

+ In Backe-End Part Spring Boot Application consists of two main packages Admin & City
+ Admin can be only used for first login page authentication
+ City Package is the main Package responsible for CRUD Operation and Graph Algorithms that is main heart of this Back-End

## How to use it ?

+ At first Login Page, you have to provide username & passoword for successful login
+ There you will get functionalities
+ At first to you are expected to use add node functionalities to build whole city network
+ Then you can add/delete as many students (here users)
+ After adding this all you can find best route such that it will take all students in minimum time with minimum number of bus. (home page)



