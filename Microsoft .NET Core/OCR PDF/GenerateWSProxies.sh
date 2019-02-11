#!/bin/sh

# Remove existing proxy
rm -rf ./ServiceReference1

# Restore project dependencies including svcutil
dotnet restore

# Generate proxies
dotnet svcutil http://localhost:41734/Muhimbi.DocumentConverter.WebService/ -n "*,ConversionService"