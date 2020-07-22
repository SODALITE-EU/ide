docker rm sodalite-ide
#Add Sodalite examples to workspace
mkdir workspace
cp -r ../dsl/org.sodalite.dsl.examples/ ./workspace
docker build --no-cache -t sodalite-ide .
rm -rf ./workspace
