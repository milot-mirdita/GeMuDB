#!/bin/sh
cd "$( cd "$( dirname "$0" )" && pwd )" 
libpath=
for i in $(ls lib/*|grep ".jar"); do 
	libpath=$( echo "$i:$libpath"); 
done
exec java -server -Xms32M -Djava.net.preferIPv4Stack=true -cp "$(echo $libpath)build/jar/Snap2.jar" org.rostlab.gemudb.Startup
