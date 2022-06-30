FROM openjdk:11-jre-slim
WORKDIR /tmp
COPY target/eksdemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
