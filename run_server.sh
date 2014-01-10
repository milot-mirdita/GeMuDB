#!/bin/sh
libpath=
for i in $(ls lib/*|grep ".jar"); do 
	libpath=$( echo "$i:$libpath"); 
done
exec java -server -Xms32M -cp "$(echo $libpath)build/jar/Snap2.jar" org.rostlab.snapdb.Startup
