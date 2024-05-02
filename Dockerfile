FROM eclipse-temurin:21.0.3_9-jdk-jammy
LABEL maintainer="hendisantika@yahoo.co.id"
VOLUME /tmp
EXPOSE 8080
ADD target/springboot-mongodb-docker-compose-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","app.jar"]
