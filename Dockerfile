# Use the official OpenJDK base image
FROM adoptopenjdk/openjdk11:alpine-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file and other necessary files to the working directory
COPY target/test_task.jar ./app.jar

# Expose the port on which the Spring application will run
EXPOSE 8080

# Run the Spring application when the container starts
CMD ["java", "-jar", "/app/app.jar"]