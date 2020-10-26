#!/usr/bin/env bash
PORT=$1
PORTS=("1111" "2222" "3333")
if [ -z "$PORT" ]; then
echo -e "please execute the command:./zjxw-dp.sh all"
fi

if [ "$PORT" == "all" ]; then
for P in ${PORTS[@]};
do
i=1
mongod --fork --dbpath=/storage/mongodb/mongodb-1/data --logpath=/storage/mongodb/mongodb-1/logs/mongodb.log --replSet zjxw --logappend --bind_ip=10.100.119.137 --port ${P}
done
fi

