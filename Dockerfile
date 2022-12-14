FROM openjdk:20-oracle
#FROM adoptopenjdk/openjdk11:alpine-jre
COPY "./target/spring-boot-csv-files-backend-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8090
#ADD target/spring-boot-csv-files-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]