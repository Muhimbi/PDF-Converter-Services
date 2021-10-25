#!/bin/bash

rm -rf ./bin
mkdir ./bin

JAVAC_VERSION=$(javac -version 2>&1)

if [[ $JAVAC_VERSION == *" 1."* ]];
then
        # Javac version < 9.0
        ADD_MODULES=""
else
        # Javac version >= 9.0
        ADD_MODULES="--add-modules java.xml.ws"
fi

javac $ADD_MODULES -d ./bin -verbose ./src/com/muhimbi/ws/*.java
javac $ADD_MODULES -d ./bin -cp ./bin -verbose ./src/com/muhimbi/app/*.java
