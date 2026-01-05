FROM eclipse-temurin:17-jdk

WORKDIR /usr/app

COPY target/docker-app.jar demo-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "docker-app.jar"]
