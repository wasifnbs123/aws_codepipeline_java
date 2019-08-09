FROM ubuntu:latest

RUN apt-get update && \
apt-get install -y default-jre awscli


EXPOSE 8080

CMD aws s3 cp s3://dockerjavas3/dockerJava/target/dockerJava-0.0.1-SNAPSHOT.jar myProject.jar && \
java -jar myProject.jar

