# E-Commerce Application using Spring Boot

## Description

This project demonstrates how we can build the back end of an application using the Java Spring Boot framework.

## Getting Started

### Dependencies and Extensions

* Java Developemnt Kit (JDK) [Version 17.0.12 or higher]
* Required Extensions for VS Code : Java Extension Pack (Microsoft), Spring Boot Extension Pack (Pivotal)

### Installation

* To download JDK :
   - Go to https://www.oracle.com/java/technologies/downloads/?er=221886
   - Download JDK. [17 or higher]
   - Follow the installation steps for your OS.
   - During installation, ensure the JAVA_HOME environment variable is set, and the JDK's bin directory is added to your system's PATH.
   - To verify installation, run the ```java -version``` and ```javac -version``` commands to ensure the JDK is properly installed.

### Executing program

1. Clone the repository:
```
git clone https://github.com/whoiskurisu/spring-boot-application.git
```
2. Open the ```spring-boot-application``` file in VS Code.

3. Create a ```.env``` file in the root directory. (This is the main folder where the ```src/```, ```pom.xml``` files are located)

4. Add an environment variable placeholder. (I will provide the Mongo URI)
```
MONGODB_URI=mongo-uri-here
```

5. Open up the integrated VS Code terminal: ``` ctrl + ` ```

6. Run the server:
```
./mvnw spring-boot:run
```
7. Open your browser and go to ```localhost:8080```
