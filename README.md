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
$ mvn spring-boot:run
````

```sh
curl --request POST \
  --url http://localhost:8180/car/ \
  --header 'Content-Type: application/json' \
  --data '{\n	"color":"red",\n	"make":"honda",\n	"model":"accord"\n}'
```

```sh
curl --request GET \
  --url http://localhost:8180/car/all
```

```sh
curl --request GET \
  --url 'http://localhost:8180/car/search?q=red'
```


### Todos

 - Write MORE Tests
 -	enable tests without breaking travis CI
