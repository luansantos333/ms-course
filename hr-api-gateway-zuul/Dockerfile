FROM openjdk:11
LABEL authors="luansantos333"
LABEL org.opencontainers.image.source="https://github.com/luansantos333/ms-course/blob/docker/hr-user/Dockerfile"

EXPOSE 8765

ADD target/hr-api-gateway-zuul-0.0.1-SNAPSHOT.jar /hr-api-gateway-zuul

ENTRYPOINT ["java", "-jar", "hr-api-gateway-zuul"]