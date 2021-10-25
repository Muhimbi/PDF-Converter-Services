#!/bin/sh

sourceName=$1 $2
if [ -z "$1" ]
  then
    sourceName="Test.pdf" "XFDF"
fi

java -classpath ./target/classes/:./target/dependency/* com.muhimbi.app.WsClient $sourceName
