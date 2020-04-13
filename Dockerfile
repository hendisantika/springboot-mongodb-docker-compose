FROM adoptopenjdk/openjdk11:alpine-jre
LABEL maintainer="hendisantika@yahoo.co.id"
VOLUME /tmp
EXPOSE 8080
ADD target/springboot-mongodb-docker-compose-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","app.jar"]