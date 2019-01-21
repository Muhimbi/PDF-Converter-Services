#!/bin/sh

sourceName=$1
if [ -z "$1" ]
  then
    sourceName="Test.pdf"
fi

java -classpath ./bin/ com.muhimbi.app.WsClient $sourceName
