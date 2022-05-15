#!/bin/bash
sudo docker pull mongo
sudo docker run -p 27017:27017 -d --name=mongodbcontainer mongo
path=$(pwd)/AnsibleDB
sudo docker cp $path mongodbcontainer:/dump
sudo docker exec -i mongodbcontainer /usr/bin/mongorestore --db AnsibleDB /dump/AnsibleDB
