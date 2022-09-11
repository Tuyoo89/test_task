FROM openjdk:18
EXPOSE 8080
ADD test_task-0.0.1-SNAPSHOT.jar test_task-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "test_task-0.0.1-SNAPSHOT.jar"]