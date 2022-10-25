#!/bin/bash

for i in *
do
	if [ -d "./$i" ]; then
		cd $i
		if [ -f "pom.xml" ]; then
			echo "Building $i"
			mvn clean install -DskipTests
		fi
			cd ..
	fi
done

echo "Build complete"
