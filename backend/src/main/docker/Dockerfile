# Use Java 21 runtime
FROM eclipse-temurin:21-jre

# Set working directory inside container
WORKDIR /app

# Copy the Spring Boot JAR
COPY target/*.jar app.jar

# Application port
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "app.jar"]