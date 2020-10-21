rmdir /S /Q .\src\com\muhimbi\ws

wsimport http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl -d src -Xnocompile -p com.muhimbi.ws

@echo.

@pause