#!/bin/sh
rm -rf ./bin
mkdir ./bin

AXIS2_CLASSPATH=""
for f in "$AXIS2_HOME"/lib/*.jar
do
  AXIS2_CLASSPATH="$AXIS2_CLASSPATH":$f
done
AXIS2_CLASSPATH="$AXIS2_HOME":"$AXIS2_HOME/conf":"$JAVA_HOME/lib/tools.jar":"$AXIS2_CLASSPATH":"$CLASSPATH"
export AXIS2_CLASSPATH

javac -d ./bin -cp $AXIS2_CLASSPATH -verbose ./src/com/muhimbi/ws/*.java
javac -d ./bin -cp ./bin:$AXIS2_CLASSPATH -verbose ./src/com/muhimbi/app/*.java
