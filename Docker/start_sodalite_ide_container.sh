#! /bin/bash

xhost +
if docker ps -a -f "name=sodalite" | grep sodalite; then
	echo 'Starting existing Sodalite container'
	docker start sodalite-ide
else
	echo 'Starting a new Sodalite container'
	docker run --name sodalite-ide -it -d -e DISPLAY=:0 -v /tmp/.X11-unix:/tmp/.X11-unix -v $(pwd)/sodalite.properties:/sodalite/eclipse/sodalite.properties "$@" sodalite-ide:latest 
fi

