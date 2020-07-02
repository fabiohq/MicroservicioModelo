FROM docker-private.codesa.com.co:5043/ubuntu_openjdk9:0.0.1
MAINTAINER jorge.gomez@codesa.com.co

ENV APP_HOME '/home/app'
RUN mkdir -p $APP_HOME

RUN chown -R app:app $APP_HOME

USER app
RUN mkdir -p $APP_HOME/config/ && mkdir -p $APP_HOME/bnet/logs/

USER app
ADD micro-crud-db-0.0.6.jar $APP_HOME/Microservicio_CRUD_DB.jar
WORKDIR $APP_HOME

EXPOSE 9090 19090
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dcom.sun.management.jmxremote.rmi.port=19090", "-Dcom.sun.management.jmxremote=true", "-Dcom.sun.management.jmxremote.port=19090", "-Dcom.sun.management.jmxremote.ssl=false", "-Dcom.sun.management.jmxremote.authenticate=false", "-Dcom.sun.management.jmxremote.local.only=false", "-Djava.rmi.server.hostname=localhost", "-jar", "-Dlog4j.configuration=file:/home/app/config/log4j.properties", "Microservicio_CRUD_DB.jar"]
