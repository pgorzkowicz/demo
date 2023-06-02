FROM ubuntu:latest
MAINTAINER "Infoshare"
RUN apt update -y
RUN apt install -y openjdk-17-jdk
RUN apt install -y maven
RUN mkdir /app
WORKDIR /app
COPY src /app/src
COPY pom.xml /app/pom.xml
RUN mvn package

CMD ["java","-jar","./target/demo-0.0.1-SNAPSHOT.jar"]