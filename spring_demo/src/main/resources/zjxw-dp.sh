#!/usr/bin/env bash
SERVER=$1
APPS=("admin" "api" "schedule" "task" "gateway" "mlfsync")
if [ -z "$SERVER" ]; then
echo -e "please execute the command:./zjxw-dp.sh all"
fi

if [ "$SERVER" == "all" ]; then
for APP in ${APPS[@]};
do
i=1
echo ${APP}+i
i++
done
fi

