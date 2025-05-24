FROM openjdk:11

LABEL authors="luansantos333"
LABEL org.opencontainers.image.source="https://github.com/luansantos333/ms-course/blob/docker/hr-user/Dockerfile"

EXPOSE 8761

COPY target/hr-eureka-server-0.0.1-SNAPSHOT.jar /hr-eureka-server.jar

CMD ["java", "-jar", "hr-eureka-server.jar"]