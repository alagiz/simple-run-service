FROM maven:3.5-jdk-8 as BUILD

COPY src /usr/src/simple-run-service/src
COPY pom.xml /usr/src/simple-run-service

RUN mvn -f /usr/src/simple-run-service/pom.xml install

FROM openjdk:8-jre-alpine

COPY --from=BUILD /usr/src/simple-run-service/target/*.jar  /app.jar