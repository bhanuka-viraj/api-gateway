# Spring Cloud API Gateway

## Student Information
- **Student Name:** J P Bhanuka Viraj Madhuranga
- **Student Number:** 241711105
- **GCP Project ID:** enterprise-cloud-module-503705

---

## Project Description
Reactive Spring Cloud API Gateway providing single entry point routing, Eureka client load balancing, and CORS handling for all EduCloud microservices.

---

## Routing Configuration
- /api/v1/users/** -> lb://user-service
- /api/v1/courses/** -> lb://course-service
- /api/v1/media/** -> lb://media-service

---

## Technology Stack
- Java 25
- Spring Boot 4.1.1
- Spring Cloud Gateway WebFlux (2025.1.3)
- Eureka Discovery Client
- PM2 Process Manager

---

## Running Locally
- Default Port: 8080
`ash
./mvnw clean package
java -jar target/api-gateway-0.0.1-SNAPSHOT.jar
`
