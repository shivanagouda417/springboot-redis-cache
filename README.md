# Spring Boot Redis Cache Example

This project demonstrates how to use Redis as a caching layer in a
Spring Boot application to improve performance by reducing database calls.
It follows a real-world backend design where cache is used for speed,
not as a source of truth.

---

## Tech Stack
- Java 17
- Spring Boot
- Spring Web
- Spring Cache
- Spring Data Redis
- Spring Data JPA
- H2 Database
- Maven
- Redis

---

## Features
- Cache account balance using Redis
- Reduce repeated database calls
- Transparent caching using Spring Cache abstraction
- Fail-safe design: application works even if Redis is unavailable
- Simple REST API to fetch account balance

---

## Caching Logic
- First API call fetches balance from the database and stores it in Redis
- Subsequent calls fetch balance directly from Redis
- Cache key is based on account ID

```java
@Cacheable(value = "balance", key = "#accountId")
