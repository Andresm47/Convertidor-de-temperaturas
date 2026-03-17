@echo off
echo empaquetando convertidor con jpackager...
jpackage --input out/artifacts/Convertidor_jar --name Convertidor.jar --main-jar convertidor.jar --main-class com.mycompany.convertidor.App --type exe --module-path "C:\Program Files\javafx-sdk-21.0.10\lib" --add-modules javafx.controls,javafx.fxml --dest dist
echo empaquetado completado, el archivo ejecutable se encuentra en la carpeta dist
pause