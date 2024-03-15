FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/docker-compose-spring-boot-0.0.1-SNAPSHOT.jar .

ENTRYPOINT [ "java", "-jar", "docker-compose-spring-boot-0.0.1-SNAPSHOT.jar" ]