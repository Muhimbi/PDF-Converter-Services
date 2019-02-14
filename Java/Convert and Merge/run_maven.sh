#!/bin/sh

sourceName=$1 $2 $3 $4
if [ -z "$1" ]
  then
    sourceName="File1.docx File2.docx"
fi

java -classpath ./target/classes/:./target/dependency/* com.muhimbi.app.WsClient $sourceName
