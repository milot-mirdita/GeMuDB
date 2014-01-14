export AXIS2_HOME=axis2-1.6.2/
export JAVA_HOME=/usr/lib/jvm/java-7-oracle/

eutils:
	./${AXIS2_HOME}bin/wsdl2java.sh -or -uri http://www.ncbi.nlm.nih.gov/soap/v2.0/eutils.wsdl
	cp build/lib/eUtilsService.aar ../../lib/eUtilsService.jar

efetch_gene:
	./${AXIS2_HOME}bin/wsdl2java.sh -or -uri http://www.ncbi.nlm.nih.gov/soap/v2.0/efetch_gene.wsdl

efetch_seq:
	./${AXIS2_HOME}bin/wsdl2java.sh -or -uri http://www.ncbi.nlm.nih.gov/soap/v2.0/efetch_seq.wsdl
	
jar: eutils efetch_gene efetch_seq
	ant jar.all
	cp build/lib/eUtilsService.aar ../../lib/eUtilsService.jar
