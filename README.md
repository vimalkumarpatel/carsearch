# carsearch

[![Build Status](https://travis-ci.org/vimalkumarpatel/carsearch.svg?branch=master)](https://travis-ci.org/vimalkumarpatel/carsearch)

Yet another Demo Spring Boot App

This webapp is a simple spring-boot application that has an in-memory H2 database.
It exposes RESTful endpoints to 
-	Create a Car.
-	Get all the cars.
-	Search for a car by search term.

### Libraries used:
-	spring-boot-starter-data-jpa
-	spring-boot-starter-web
-	h2

### Installation
```sh
$ mvn clean install
````

### Todos

 - Write MORE Tests
 -	enable tests without breaking travis CI
