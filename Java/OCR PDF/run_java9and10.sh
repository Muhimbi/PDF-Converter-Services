#!/bin/sh

sourceName=$1
if [ -z "$1" ]
  then
    sourceName="Test.pdf"
fi

java --add-modules java.xml.ws -classpath ./bin/ com.muhimbi.app.WsClient $sourceName
