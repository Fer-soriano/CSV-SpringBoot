FROM openjdk:20-oracle
COPY "./target/spring-boot-csv-files-backend-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]