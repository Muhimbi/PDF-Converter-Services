#!/bin/sh

rm -rf ./src/com/muhimbi/ws

$AXIS2_HOME/bin/wsdl2java.sh -uri http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl --noBuildXML -Daxis2.jalopy=false -p com.muhimbi.ws 
