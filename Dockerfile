FROM openjdk:17-jdk-slim
COPY target/clinic-app.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]