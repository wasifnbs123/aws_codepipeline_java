FROM ubuntu:latest

RUN apt-get update && \
apt-get install -y default-jre awscli

EXPOSE 8080

CMD ["sh", "-c", "aws s3 cp s3://terraform-wasi-bucket/dockerJava/target/dockerJava-0.0.1-SNAPSHOT.jar springBootProject.jar ; java -jar springBootProject.jar"]
