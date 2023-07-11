# Use the official OpenJDK base image
FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=/target/*.jar

# Set the working directory inside the container
WORKDIR /src

# Copy the JAR file and other necessary files to the working directory
COPY ${JAR_FILE} application.jar

# Expose the port on which the Spring application will run
EXPOSE 8080

# Run the Spring application when the container starts
CMD ["java", "-jar", "/app/app.jar"]