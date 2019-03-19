FROM openjdk:8-alpine
COPY build/libs/*-all.jar yait-web.jar
EXPOSE 8080
CMD java ${JAVA_OPTS} -jar yait-web.jar