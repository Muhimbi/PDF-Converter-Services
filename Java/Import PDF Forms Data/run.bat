@echo off

set sourceName=%1 %2
if [%1]==[] set sourceName="Data.xfdf" "Template.pdf"

java -classpath "./bin/" com.muhimbi.app.WsClient %sourceName%

echo.

pause