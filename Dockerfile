FROM openjdk:18-jdk-alpine

WORKDIR /app

COPY target/jenkins-build-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8585

CMD ["java", "-jar", "app.jar"]
