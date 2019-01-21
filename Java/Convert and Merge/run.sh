#!/bin/sh

sourceName=$1 $2 $3 $4
if [ -z "$1" ]
  then
    sourceName="file1.docx file2.docx"
fi

java -classpath ./bin/ com.muhimbi.app.WsClient $sourceName
