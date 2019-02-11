@echo off
REM Remove existing proxy
if exist ServiceReference1 ( rmdir /S /Q ServiceReference1 )

REM Restore project dependencies including svcutil
dotnet restore

REM Generate proxies
dotnet svcutil http://localhost:41734/Muhimbi.DocumentConverter.WebService/ -n "*,ConversionService"

echo.