#!/bin/sh

sourceName=$1 $2 $3 $4
if [ -z "$1" ]
  then
    sourceName="File1.docx File2.docx"
fi

java -classpath ./bin/ com.muhimbi.app.WsClient $sourceName
