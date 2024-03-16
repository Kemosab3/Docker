# Use the official OpenJDK image as a parent image
FROM openjdk:21

# Set the working directory inside the container
WORKDIR /app

# Copy the Java program into the container
COPY TimiDocker.java /app

# Compile the Java program
RUN javac TimiDocker.java

# Define the command to run the Java program
CMD ["java", "TimiDocker"]
