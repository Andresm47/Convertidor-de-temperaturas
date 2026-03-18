@echo off
echo Generando instalador .msi...
jpackage ^
  --input target ^
  --name Convertidor ^
  --main-jar Convertidor-1.0-SNAPSHOT.jar ^
  --main-class application.Launcher ^
  --type msi ^
  --module-path "C:\Program Files\javafx-sdk-21.0.10\lib" ^
  --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base,javafx.media ^
  --dest dist ^
  --win-menu ^
  --win-shortcut ^
  --app-version 1.0.0 ^
  --vendor "Andres Morales" ^
  --verbose
pause