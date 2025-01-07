FROM openjdk:17-jdk

ARG JAR_FILE=./build/libs/goormthonUniv-0.01-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]