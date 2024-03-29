FROM maven:3.8.7-openjdk-18-slim

RUN mkdir /opt/checkpoint1

COPY . /opt/checkpoint1

WORKDIR /opt/checkpoint1

RUN mvn clean package

ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILE}", "-jar", "target/app.jar"]

