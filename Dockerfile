FROM maven:3.6.2-jdk-8-slim AS build

LABEL maintainer="danieldarosati@gmail.com"

COPY ./ /usr/src/app/

WORKDIR /usr/src/app/

RUN mvn clean package -U -DskipTests

FROM openjdk:8-jre-slim-buster

COPY --from=build /usr/src/app/target/java-api-practice*.jar ./java-api-practice.jar

EXPOSE 11000

ENTRYPOINT ["java", "-jar", "java-api-practice.jar"]