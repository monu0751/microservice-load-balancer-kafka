**Project Name:** Microservice Architecture Example

![quiz-architecture.png](quiz-architecture.png)

**Description:**

This repository implements a microservice architecture using Spring Boot and Spring Cloud Netflix, consisting of four services:

**QUIZ-SERVICE (port:8081):** Manages quizzes and their associated data.
**QUESTION-SERVICE (port:9092):** Provides CRUD operations for individual questions.
**REGISTRY-SERVICE (port:8761):** Acts as a Eureka Server for service discovery.
**API-GATEWAY (port:8084):** Serves as a single entry point for API requests, routing them to the appropriate microservice.
**Key Features:**

**Clean separation of concerns:** Each service has a well-defined responsibility, promoting maintainability and scalability.
**Improved flexibility:** Independent deployment and scaling of services based on individual needs.
**Fault isolation:** Issues in one service don't cascade to others, enhancing overall resilience.
**Spring Cloud Netflix integration:** Leverages Eureka for service discovery and Hystrix for fault tolerance and circuit breaking.
**Open Feign:** Streamlines inter-service communication with declarative API interactions.
**Dependencies:**

Each service includes the necessary Spring Boot and Spring Cloud Netflix dependencies specified in its pom.xml file.

**Inter-service Communication:**

QUESTION-SERVICE is deployed independently and accessed by QUIZ-SERVICE using Open Feign Client.
Services discover each other through the Eureka Registry-Service.
Notes:

This is a basic example and can be extended to include additional features and services.
For production environments, consider container orchestration and configuration management tools.
Implement security measures like authentication and authorization to protect API endpoints.


