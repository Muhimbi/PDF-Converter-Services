#!/bin/sh

sourceName=$1
if [ -z "$1" ]
  then
    sourceName="test.docx"
fi

echo $AXIS2_HOME

java -classpath ./bin/:$AXIS2_HOME/lib/* com.muhimbi.app.WsClient $sourceName
