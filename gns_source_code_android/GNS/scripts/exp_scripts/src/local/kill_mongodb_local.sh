#!/bin/sh
echo "Killed mongod instances ..."
dbFolder=$1
killall -9 mongod
echo "Delete mongod files ..."
#cat hosts_ns.txt | parallel ssh {}  "rm -rf /home/abhigyan/gnrs-db-mongodb/{}/*"
rm -rf $dbFolder
