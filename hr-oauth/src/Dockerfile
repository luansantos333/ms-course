FROM openjdk:11

LABEL authors="luansantos333"
LABEL org.opencontainers.image.source="https://github.com/luansantos333/ms-course/blob/docker/hr-user/Dockerfile"

COPY target/hr-oauth-0.0.1-SNAPSHOT.jar /hr-oauth.jar

CMD ["java", "-jar", "hr-oauth.jar"]