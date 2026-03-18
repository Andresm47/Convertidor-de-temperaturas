@echo off
echo empaquetando convertidor con jpackager...
jpackage --input target --name Convertidor --main-jar Convertidor-1.0-SNAPSHOT.jar --main-class application.Launcher --type app-image --module-path "C:\Program Files\javafx-sdk-21.0.10\lib" --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base,javafx.media --dest dist --verbose
echo empaquetado completado, el archivo ejecutable se encuentra en la carpeta dist
pause