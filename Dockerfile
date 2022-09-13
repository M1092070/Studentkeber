FROM openjdk:17
LABEL maintainer="susmita.net"
ADD target/demo-for-student.jar demo-for-student.jar
ENTRYPOINT ["java","-jar","demo-for-student.jar"]