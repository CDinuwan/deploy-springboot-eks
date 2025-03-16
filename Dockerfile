FROM openjdk:17
ADD target/springboot-eks-deployment.jar springboot-eks-deployment.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-eks-deployment.jar"]