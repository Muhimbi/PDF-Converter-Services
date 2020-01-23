@echo off

set sourceName=%1
if [%1]==[] set sourceName=Test.docx

java -classpath "./bin/" com.muhimbi.app.WsClient %sourceName%

echo.

pause