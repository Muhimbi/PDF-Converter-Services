@echo off

set sourceName=%1 %2 %3 %4 %5 %6 %7 %8 %9
if [%1]==[] set sourceName="File1.docx" "File2.docx"

java -classpath "./bin/" com.muhimbi.app.WsClient %sourceName%

echo.

pause