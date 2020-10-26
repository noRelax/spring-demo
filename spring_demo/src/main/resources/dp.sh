#!/usr/bin/env bash

SERVER=$1
ACTION=$2
APPS=("admin","api","task")

ws(){
    echo "this is a method..."
}
if [ ! -n "$SERVER" -o ! -n "$ACTION" -o ! -n "" ]; then
    echo "you have not input a server"
    exit 0
fi

if echo ${APPS[@]} | grep -w "$SERVER" &>/dev/null; then
    echo "the app's name is:" $SERVER
exit 0
fi


if [ "$SERVER" == "all" ]; then
for APP in ${APPS[@]};
do
    echo ${APP}
done
fi
ws



