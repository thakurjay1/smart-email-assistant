# Backend Dockerfile
FROM openjdk:17-jdk-slim as backend

# Set the working directory
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/email-assistant-0.0.1-SNAPSHOT.jar /app

# Expose the application port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/email-assistant-0.0.1-SNAPSHOT.jar"]