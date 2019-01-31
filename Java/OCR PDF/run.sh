#!/bin/sh

sourceName=$1
if [ -z "$1" ]
  then
    sourceName="Test.PDF"
fi

java -classpath ./bin/ com.muhimbi.app.WsClient $sourceName
