FROM openjdk:17
EXPOSE 8082
ADD target/devops-assignement2.jar devops-assignement2.jar
ENTRYPOINT ["java","-jar", "/devops-assignement2.jar"]
