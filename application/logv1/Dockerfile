FROM openjdk:17-alpine
MAINTAINER lob

EXPOSE 8080

WORKDIR /data/etc
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]