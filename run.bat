@echo off
REM Script para compilar y ejecutar la aplicación Convertidor

setlocal enabledelayedexpansion

REM Obtener la ruta actual
set PROJECT_DIR=%~dp0
set SRC_DIR=%PROJECT_DIR%src\main\java
set RESOURCES_DIR=%PROJECT_DIR%src\main\resources
set TARGET_DIR=%PROJECT_DIR%target
set CLASSES_DIR=%TARGET_DIR%\classes

REM Crear directorios si no existen
if not exist "%CLASSES_DIR%" mkdir "%CLASSES_DIR%"

REM Compilar el proyecto
echo Compilando proyecto...
cd /d "%PROJECT_DIR%"

REM Buscar archivos .java recursivamente
for /r "%SRC_DIR%" %%F in (*.java) do (
    set "JAVA_FILES=!JAVA_FILES! "%%F""
)

REM Compilar con JavaFX
javac -d "%CLASSES_DIR%" -cp "%SRC_DIR%" %JAVA_FILES% 2>&1
if errorlevel 1 (
    echo Error en la compilación
    pause
    exit /b 1
)

echo Compilación exitosa
pause

