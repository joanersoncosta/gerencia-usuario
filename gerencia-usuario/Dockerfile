FROM openjdk:17

ARG JAR_FILE=./target/*.jar

EXPOSE 8082

COPY ${JAR_FILE} gerencia-pessoa.jar

ENTRYPOINT ["java", "-jar", "gerencia-pessoa.jar"]