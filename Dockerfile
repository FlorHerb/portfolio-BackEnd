FROM amazoncorretto:11-alpine-jdk
MAINTAINER florencia
COPY target/florherber-0.0.1-SNAPSHOT.jar portfolio-herber.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","portfolio-herber.jar"]


