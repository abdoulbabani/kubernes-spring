From openjdk:11
EXPOSE 8080
COPY target/spring-kubernetes-0.0.1-SNAPSHOT.jar spring-kubernetes.jar
ENTRYPOINT ["java", "-jar", "spring-kubernetes.jar"]