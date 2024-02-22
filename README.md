Here we have created three microservice:
  QUIZ-SERVICE (port:8081)
  QUESTION-SERVICE (port:9092)
  REGISTRY-SERVICE (port:8761)

We also have created API gateway using spring-cloud-starter-gateway
  API-GATEWAY (port:8084)

We used spring-cloud-starter-netflix-eureka-client and made QUIZ-SERVICE, QUESTION-SERVICE and API-GATEWAY as Eureka Client Server
We used spring-cloud-starter-netflix-eureka-server and made REGISTRY-SERVICE as Eureka SERVER

Internally QUIZ-SERVICE is calling QUESTION-SERVICE by using Open-Feign Client.
