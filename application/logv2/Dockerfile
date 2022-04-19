FROM openjdk:17-alpine
LABEL developer="kwj1270@naver.com"

EXPOSE 8090

WORKDIR /data/etc
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
