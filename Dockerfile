FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD ./target/spring-cloud-gateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]