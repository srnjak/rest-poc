FROM openliberty/open-liberty:20.0.0.12-full-java11-openj9-ubi
MAINTAINER Grega Krajnc, srnjak.com

ENV INSTALL_DIR /opt/ol/wlp
ENV CONFIG_DIR /config/configDropins/defaults
ENV DEPLOYMENT_DIR /config/dropins

COPY src/main/liberty/config/server.xml ${CONFIG_DIR}/
COPY target/rest.war ${DEPLOYMENT_DIR}/

RUN configure.sh
