#!/bin/sh

rm -rf ./bin
mkdir ./bin

javac -d ./bin -verbose ./src/com/muhimbi/ws/*.java
javac -d ./bin -cp ./bin -verbose ./src/com/muhimbi/app/*.java
