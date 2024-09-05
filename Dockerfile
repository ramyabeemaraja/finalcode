FROM openjdk:22
COPY ./target/finalas.jar finalas.jar
CMD ["java","-jar","finalas.jar"]