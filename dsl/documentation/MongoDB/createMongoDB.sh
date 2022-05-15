#!/bin/bash
DIALOG_CANCEL=1
DIALOG_ESC=255
HEIGHT=0
WIDTH=0

display_result() {
  dialog --title "$1" \
    --no-collapse \
    --msgbox "$result" 0 0
}

while true; do
  exec 3>&1
  selection=$(dialog \
    --backtitle "MongoDB" \
    --title "Restore AnsibleDB" \
    --clear \
    --cancel-label "Exit" \
    --menu "Please select:" $HEIGHT $WIDTH 4 \
    "1" "Restore AnsibleDB from local file" \
    "2" "Restore AnsibleDB from Ansible Galaxy" \
    2>&1 1>&3)
  exit_status=$?
  exec 3>&-
  case $exit_status in
    $DIALOG_CANCEL)
      clear
      echo "Program terminated."
      exit
      ;;
    $DIALOG_ESC)
      clear
      echo "Program aborted." >&2
      exit 1
      ;;
  esac
  case $selection in
    1 )
	  clear
	  sudo docker pull mongo
      sudo docker run -p 27017:27017 -d --name=mongodbcontainer mongo
      path=$(pwd)/AnsibleDB
      sudo docker cp $path mongodbcontainer:/dump
      sudo docker exec -i mongodbcontainer /usr/bin/mongorestore --db AnsibleDB /dump/
      exit
      ;;
    2 )
	  clear
	  sudo docker pull mongo
      sudo docker run -p 27017:27017 -d --name=mongodbcontainer mongo
	  echo "Please enter folder path for temporary files:"
	  read metadata_folder
	  echo "Please enter default Ansible path for collections:"
	  read collection_path
	  echo "Download collections from Ansible Galaxy"
	  python3 createMongoDBAnsibleCollections.py $metadata_folder $collection_path
	  python3 completeAnsibleCollectionsInfoWeb.py
      rm -r $metadata_folder/*
	  echo "Download roles from Ansible Galaxy"
	  python3 createMongoDBAnsibleRoles.py  
      ;;
  esac
done
