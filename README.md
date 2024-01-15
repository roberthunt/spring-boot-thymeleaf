# Getting Started

Simply run from the command line using `./mvnw spring-boot:run` and then open http://localhost:8080

![](example.png)

See `SpringBootThymeleafApplication` which is marked as a Spring MVC `@Controller` and has one `@GetMapping` to serve a
Thymeleaf templated called `index` and is located at `src/main/resources/templates/index.html`.

A Java `record` represents a customer with 4 fields, an id, created date, name and active flag. A list of customers is
created in the controller method and returned ot the view via the Spring MVC `Model`.

The Thymeleaf template contains a basic HTML page with a table that iterates over the customers and displays the 
details. A few different examples of Thymeleaf constructs and utilities are also demonstrated.