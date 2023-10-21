FROM eclipse-temurin:17
COPY target/devopss.jar devopss.jar
CMD [ "java","-jar","devopss.jar" ]