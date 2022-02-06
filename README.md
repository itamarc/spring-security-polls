# Polls Application

This application is a study app to learn about web security using:
- Spring Framework (Spring Security and Spring Boot)
- React.js
- JWT
- MySQL

This code is based on the tutorial that you can find on:
- https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-1/

The original source code can be found at:
- https://github.com/callicoder/spring-security-react-ant-design-polls-app

Relevant changes I've made:
- My MySQL connection data is on an ```application-dev.properties``` and I set up ```dev``` as the active profile in my IDE.
- JWT key and expiration time are also in ```dev``` profile configuration.
- Changed some deprecated classes and methods in JWT authentication to the recommended substitutions.
- Changed some field injection to constructor injection, as recommended now by Spring.
- I'm using Lombok to provide the logging through ```@Slf4j``` annotation.
