#!/bin/sh

rm -rf ./src/com/muhimbi/ws

sh $AXIS2_HOME/bin/wsdl2java.sh -uri http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl --noBuildXML -p com.muhimbi.ws 