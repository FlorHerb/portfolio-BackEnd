FROM amazoncorretto:8-alpine-jdk
MAINTAINER florencia
COPY target/florherber-0.0.1-SNAPSHOT.jar portfolio-herber.jar
ENTRYPOINT ["java","-jar","portfolio-herber.jar"]

