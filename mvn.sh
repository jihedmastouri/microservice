cd jwtprj
mvn clean install -DskipTests
cd ..

cd Constats
mvn clean install -DskipTests
cd ..

cd EurekaServer
mvn clean install -DskipTests
cd ..

cd ApiGateway
mvn clean install -DskipTests
cd ..

echo "Build complete"
