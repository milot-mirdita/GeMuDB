#!/usr/bin/env bash
DISPLAY=":0" PATH=/home/proj/biosoft/software/R/R-2.14.0/bin/:$PATH java -Dsun.net.httpserver.idleInterval=3600 -Dsun.net.http.retryPost=false -cp .:aopalliance-1.0.jar:biojava3-alignment-3.0.2.jar:biojava3-alignment-3.0.2-sources.jar:biojava3-core-3.0.2.jar:biojava3-core-3.0.2-sources.jar:biojava3-genome-3.0.2.jar:biojava3-structure-3.0.2.jar:biojava3-structure-3.0.2-sources.jar:bla.txt:commons-codec-1.6.jar:commons-codec-1.6-javadoc.jar:commons-codec-1.6-sources.jar:commons-dbcp-1.4.jar:commons-dbcp-1.4-javadoc.jar:commons-dbcp-1.4-sources.jar:commons-logging-1.1.1.jar:commons-logging-1.1.1-sources.jar:commons-pool-1.6.jar:commons-pool-1.6-sources.jar:gson-2.1.jar:gson-2.1-javadoc.jar:gson-2.1-sources.jar:guava-11.0.2.jar:hamcrest-core-1.1.jar:hamcrest-library-1.1.jar:hessian-4.0.7.jar:hessian-4.0.7-src.jar:jmock-junit4-2.5.1.jar:jopt-simple-4.3.jar:jopt-simple-4.3-sources.jar:kxml2-min-2.3.0.jar:log4j-1.2.16.jar:mysql-connector-java-5.0.8-bin.jar:org.springframework.aop-3.1.1.RELEASE.jar:org.springframework.aop-sources-3.1.1.RELEASE.jar:org.springframework.asm-3.1.1.RELEASE.jar:org.springframework.asm-sources-3.1.1.RELEASE.jar:org.springframework.aspects-3.1.1.RELEASE.jar:org.springframework.aspects-sources-3.1.1.RELEASE.jar:org.springframework.beans-3.1.1.RELEASE.jar:org.springframework.beans-sources-3.1.1.RELEASE.jar:org.springframework.context-3.1.1.RELEASE.jar:org.springframework.context-sources-3.1.1.RELEASE.jar:org.springframework.context.support-3.1.1.RELEASE.jar:org.springframework.context.support-sources-3.1.1.RELEASE.jar:org.springframework.core-3.1.1.RELEASE.jar:org.springframework.core-sources-3.1.1.RELEASE.jar:org.springframework.expression-3.1.1.RELEASE.jar:org.springframework.expression-sources-3.1.1.RELEASE.jar:org.springframework.instrument-3.1.1.RELEASE.jar:org.springframework.instrument-sources-3.1.1.RELEASE.jar:org.springframework.instrument.tomcat-3.1.1.RELEASE.jar:org.springframework.instrument.tomcat-sources-3.1.1.RELEASE.jar:org.springframework.jdbc-3.1.1.RELEASE.jar:org.springframework.jdbc-sources-3.1.1.RELEASE.jar:org.springframework.jms-3.1.1.RELEASE.jar:org.springframework.jms-sources-3.1.1.RELEASE.jar:org.springframework.orm-3.1.1.RELEASE.jar:org.springframework.orm-sources-3.1.1.RELEASE.jar:org.springframework.oxm-3.1.1.RELEASE.jar:org.springframework.oxm-sources-3.1.1.RELEASE.jar:org.springframework.spring-library-3.1.1.RELEASE.libd:org.springframework.test-3.1.1.RELEASE.jar:org.springframework.test-sources-3.1.1.RELEASE.jar:org.springframework.transaction-3.1.1.RELEASE.jar:org.springframework.transaction-sources-3.1.1.RELEASE.jar:org.springframework.web-3.1.1.RELEASE.jar:org.springframework.web.portlet-3.1.1.RELEASE.jar:org.springframework.web.portlet-sources-3.1.1.RELEASE.jar:org.springframework.web.servlet-3.1.1.RELEASE.jar:org.springframework.web.servlet-sources-3.1.1.RELEASE.jar:org.springframework.web-sources-3.1.1.RELEASE.jar:org.springframework.web.struts-3.1.1.RELEASE.jar:org.springframework.web.struts-sources-3.1.1.RELEASE.jar:propra_backend.jar:xstream-1.4.2.jar org.de.lmu.propra.Startup