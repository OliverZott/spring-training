# Spring Boot - Training Examples

## Setup

- https://start.spring.io/

- **Dev-Tools** for **Hot-Reload**
  - IntelliJ's settings: "build project automatically" and "allow auto-make to start"
- **Actuator**
  - config in `application.properties`
  - `localhost:8080/actuator/health`
  - `localhost:8080/actuator/info`
- **Security**
  - basic usage: auto generated credentials or in application.properties defined (bad practice)


## CLI

- JAR file includes Tomcat and code
```shell
# windows / linux
./mvnw package
./mvnw spring-boot:run  # using spring-boot-maven plugin
java -jar ./target/app-name-SNAPSHOT.jar

./mvnw clean compile test
```
