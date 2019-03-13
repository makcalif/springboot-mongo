FROM openjdk:10-jre-slim
WORKDIR /app
COPY build/libs/*.jar /app/person.jar
EXPOSE 8088
CMD ["java", "-jar", "/app/person.jar"]
