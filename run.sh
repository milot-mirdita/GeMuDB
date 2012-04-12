#!/usr/bin/env bash
libpath=
for i in $(ls lib/*|grep ".jar"); do 
	libpath=$( echo "$i:$libpath"); 
done
echo $libpath
java -cp "$(echo $libpath)build/jar/Snap2.jar" org.rostlab.snapdb.Import $1
