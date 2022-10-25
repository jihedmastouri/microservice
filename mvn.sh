# get everything in folder to a list
a=./
echo "${a[@]}"

for i in "$a"/*; do
	if [ -d "$i" ]; then
		cd $i
		if [ -f "pom.xml" ]; then
			echo "Building $i"
			mvn clean install -DskipTests
			cd ..
		fi
	fi
done

echo "Build complete"
