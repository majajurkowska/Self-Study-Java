# Self-Study

* In the folder `Java Exercises` are all the Exercises found for the Java Self Study.
* In the same folder is a folder called `library_management_spring`. This is the small project I created with the knowledge from the
  exercises I gained. I know the project structure is not optimal, but I'm still learning for the future

**Please note:** the project is still in work and might not run perfectly.

## Library Management Spring Project

### Description

The `library_management_spring` project is just a simple library management system built using Spring Boot. 
You can add, view, and remove books in there. This project should demonstrate various Java concepts such as 
object-oriented programming, data structures, control structures, and more.

### What is Spring Boot?

It's a framework that makes it easy to create stand-alone applications with Java that can easily be hosted on localhost, 
even with a HTML Page. It makes it easy to have a Java Project not only as a terminal application, but a real live page 
where you can actually do things.

### What is Maven?

It's an automation tool used primarily for Java projects. It helps manage project dependencies, compile source code, and run tests. 
Maven uses a `pom.xml` file to manage the project's dependencies and build configuration. The Library Management Project was built using Maven.

### How to run

Please have

- The newest JAVA SDK!
- Maven (Should be in IntelliJ already)
- An IDE such as IntelliJ, its prefered as it comes with a lot of stuff already preinstalled like Maven and Spring Boot

### Setup

- navigate to `Java Projects/library_management_spring`
- run `mvn clean install` (I had troubles making it work in my terminal, but it did work fine in IntelliJ, you might have to right click the 
  pom.xml file and do Maven > Reload Project)
- run `mvn spring-boot:run`
- Open your web browser and go to: http://localhost:8080

