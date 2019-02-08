#!/bin/bash

JAVA_VERSION=$(java -version 2>&1)

if [[ $JAVA_VERSION == *'"1.'* ]];
then
        # Java version < 9.0
        ADD_MODULES=""
else
        # Java version >= 9.0
        ADD_MODULES="--add-modules java.xml.ws"
fi

sourceName=$1
if [ -z "$1" ]
  then
    sourceName="Test.docx"
fi

java $ADD_MODULES -classpath ./bin/ com.muhimbi.app.WsClient $sourceName
