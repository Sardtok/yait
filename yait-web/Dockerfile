FROM openjdk:8-alpine
RUN apk --no-cache add curl
COPY build/libs/*-all.jar yait-web.jar
CMD java ${JAVA_OPTS} -jar yait-web.jar