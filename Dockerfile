FROM amazoncorretto:17
MAINTAINER tunombre_o_alias
COPY target/portfolioBackEnd-0.0.1-SNAPSHOT.jar portfolioBackEnd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolioBackEnd-0.0.1-SNAPSHOT.jar"]