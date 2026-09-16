FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . /app
RUN javac GreatestOfThree.java TestGreatest.java
CMD ["java", "GreatestOfThree"]
