FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY *.java ./
COPY *.class ./
CMD ["java", "TestGreatest"]
