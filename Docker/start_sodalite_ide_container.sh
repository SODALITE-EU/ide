xhost +
if docker ps -a -f "name=sodalite" | grep sodalite; then
	echo 'Starting existing Sodalite container'
	docker start sodalite
else
	echo 'Starting a new Sodalite container'
	docker run --name sodalite -it -d -e DISPLAY=:0 -v /tmp/.X11-unix:/tmp/.X11-unix sodalite-ide:v0.1
fi

