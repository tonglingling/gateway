FROM hub.c.163.com/library/java:8-alpine
ADD target/*.jar gateway.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]


