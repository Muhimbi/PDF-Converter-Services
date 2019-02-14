#!/bin/sh

sourceName=$1
if [ -z "$1" ]
  then
    sourceName="Test.docx"
fi

java -classpath ./target/classes/:./target/dependency/* com.muhimbi.app.WsClient $sourceName
