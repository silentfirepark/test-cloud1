FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloud1.jar
ENTRYPOINT ["java","-jar","/cloud1.jar"]