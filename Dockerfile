FROM openjdk:11
COPY target/*SNAPSHOT.jar app.jar
EXPOSE 8100
ENTRYPOINT ["java", "-jar", "/app.jar"]
