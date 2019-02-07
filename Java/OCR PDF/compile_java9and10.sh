#!/bin/sh

rm -rf ./bin
mkdir ./bin

javac --add-modules java.xml.ws -d ./bin -verbose ./src/com/muhimbi/ws/*.java
javac --add-modules java.xml.ws -d ./bin -cp ./bin -verbose ./src/com/muhimbi/app/*.java
