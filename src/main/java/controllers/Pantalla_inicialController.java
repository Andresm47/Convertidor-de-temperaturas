package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Pantalla_inicialController {

    @FXML
    private TextField campoGrados;

    @FXML
    private TextField campoUnidad;

    @FXML
    private TextArea lblmensaje;

    @FXML
    void click(ActionEvent event) {
        try {
            double grados = Double.parseDouble(campoGrados.getText());
            String unidad = campoUnidad.getText().toUpperCase();
            if (unidad.equals("C")) {
                // Primera operación: Convertir a Fahrenheit
                double fahrenheit = (grados * 9.0 / 5.0) + 32;
                // Segunda operación: Convertir a Kelvin
                double kelvin = grados + 273.15;
                lblmensaje.setText(
                        grados + " °C son: " + fahrenheit + " °F \n" +
                        grados + " °C son: " + kelvin + " °K ");
            } else if (unidad.equals("F")) {
                // Primera operación: Convertir a Celsius
                double celsius = (grados - 32) * 5.0 / 9.0;
                // Segunda operación: Convertir a Kelvin
                double kelvin = (grados - 32) * 5.0 / 9.0 + 273.15;
                lblmensaje.setText(
                        grados + " °F son: " + celsius + " °C \n" +
                        grados + " °F son: " + kelvin + " °K ");
            } else if (unidad.equals("K")) {
                // Primera operación: Convertir a Celsius
                double celsius = grados - 273.15;
                // Segunda operación: Convertir a Fahrenheit
                double fahrenheit = (grados - 273.15) * 9.0 / 5.0 + 32;
                lblmensaje.setText(
                        grados + " °K son: " + celsius + " °C \n" +
                        grados + " °K son: " + fahrenheit + " °F ");

            }
        } catch (NumberFormatException e) {
            lblmensaje.setText("Por favor, ingresa un número válido para los grados.");
        }
    }

}