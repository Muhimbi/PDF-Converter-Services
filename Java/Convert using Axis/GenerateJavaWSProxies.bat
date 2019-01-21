rmdir /S /Q .\src\com\muhimbi\ws

cmd /c wsdl2java.bat -uri http://localhost:41734/Muhimbi.DocumentConverter.WebService/?wsdl --noBuildXML -p com.muhimbi.ws 

@echo.

@pause