@echo off

set sourceName=%1
if [%1]==[] set sourceName=test.pdf

java -classpath "./bin/" com.muhimbi.app.WsClient %sourceName%

echo.

pause