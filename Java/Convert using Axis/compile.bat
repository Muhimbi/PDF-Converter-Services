rmdir /S /Q .\bin
md bin

javac -d ./bin -cp "%AXIS2_HOME%/lib/*"  -verbose ./src/com/muhimbi/ws/*.java
javac -d ./bin -cp "./bin;%AXIS2_HOME%/lib/*" -verbose ./src/com/muhimbi/app/*.java

@echo off
pause

