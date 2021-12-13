FROM adoptopenjdk/openjdk11:latest
EXPOSE 7070
ARG JAR_FILE=./target/reports-api-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} reportsapi.jar
ENTRYPOINT ["java", "-jar", "/reportsapi.jar"]