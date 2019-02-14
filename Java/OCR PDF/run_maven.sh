#!/bin/sh

sourceName=$1
if [ -z "$1" ]
  then
    sourceName="Test.pdf"
fi

java -classpath ./target/classes/:./target/dependency/* com.muhimbi.app.WsClient $sourceName
