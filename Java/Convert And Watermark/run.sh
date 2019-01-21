#!/bin/sh

sourceName=$1
if [ -z "$1" ]
  then
    sourceName="test.docx"
fi

java -classpath ./bin/ com.muhimbi.app.WsClient $sourceName
