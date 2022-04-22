FROM openjdk:8
    EXPOSE 8094
    ADD /target/area-service-docker.jar area-service-docker.jar
    ENTRYPOINT ["java","-jar","/area-service-docker.jar"]