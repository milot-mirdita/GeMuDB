export AXIS2_HOME=axis2-1.6.2/
export JAVA_HOME=/usr/lib/jvm/java-7-oracle/

code:
	./${AXIS2_HOME}bin/wsdl2java.sh -or -uri http://www.ncbi.nlm.nih.gov/soap/v2.0/eutils.wsdl

jar:
	ant jar.all
	cp build/lib/eUtilsService.aar ../../lib/eUtilsService.jar
