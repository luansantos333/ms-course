FROM openjdk:11

LABEL authors="luansantos333"
LABEL org.opencontainers.image.source=

WORKDIR /usr/src/app
RUN useradd -s /usr/bin/bash java

COPY --chown=java:java target/hr-user-0.0.1-SNAPSHOT.jar ./
USER java

CMD ["java", "-jar", "hr-user-0.0.1-SNAPSHOT.jar"]



