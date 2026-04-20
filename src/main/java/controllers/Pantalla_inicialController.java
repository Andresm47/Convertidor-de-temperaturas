package controllers;
// Se importan las librerias necesarias para el funcionamiento de la aplicacion, como JavaFX.
import application.Operaciones;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;

public class Pantalla_inicialController {
// Se definen los campos de texto y el área de texto que se utilizarán en la interfaz gráfica,
// y se asignan a las variables correspondientes utilizando la anotación @FXML.
    @FXML
    private TextField campoGrados;

    @FXML
    private ComboBox<String> gradeslist;

    @FXML
    private TextField campoUnidad;

    @FXML
    private TextArea lblmensaje;

    @FXML
    private void initialize() {
        // Se pueden agregar opciones al ComboBox si es necesario
        gradeslist.setItems(FXCollections.observableArrayList("°C", "°F", "°K"));
    }

    @FXML
    public void click(ActionEvent event) {
// Se utiliza un bloque try-catch para manejar posibles excepciones al convertir el texto ingresado a un número.
        try {
            double grados = Double.parseDouble(campoGrados.getText());
// Se utiliza gradeslist.getValue para que el programa pueda reconocer lo que se selecciona en el combo box
            String unidad = gradeslist.getValue();
            if (unidad == null) {
                lblmensaje.setText("Por favor, selecciona una unidad de temperatura.");
                return;
            }

            if (unidad.equals("°C")) {
                // Primera operación: Convertir a Fahrenheit
                double fahrenheit = Operaciones.CelsiusAFahrenheit(grados);
                // Segunda operación: Convertir a Kelvin
                double kelvin = Operaciones.CelsiusAKelvin(grados);
                lblmensaje.setText(
                       String.format("%.2f", fahrenheit) + " °F \n" +
                       String.format("%.2f", kelvin) + " °K ");
            } else if (unidad.equals("°F")) {
                // Primera operación: Convertir a Celsius
                double celsius = Operaciones.FahrenheitACelsius(grados);
                // Segunda operación: Convertir a Kelvin
                double kelvin = Operaciones.FahrenheitAKelvin(grados);
                lblmensaje.setText(
                       String.format("%.2f", celsius) + " °C \n" +
                       String.format("%.2f", kelvin) + " °K ");
            } else if (unidad.equals("°K")) {
                // Primera operación: Convertir a Celsius
                double celsius = Operaciones.KelvinACelsius(grados);
                // Segunda operación: Convertir a Fahrenheit
                double fahrenheit = Operaciones.KelvinAFahrenheit(grados);
                lblmensaje.setText(
                        String.format("%.2f", celsius) + " °C \n" +
                        String.format("%.2f", fahrenheit) + " °F ");

            }
        } catch (NumberFormatException e) {
            lblmensaje.setText("Por favor, ingresa un número válido para los grados.");
        }
    }

    @FXML
    public void regresar(javafx.event.ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.control.Button) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Abrir el menú inicial
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Menu_Inicial.fxml"));
            Stage menuStage = new Stage();
            AnchorPane root = fxmlLoader.load();
            Scene scene = new Scene(root);

            menuStage.setScene(scene);
            menuStage.setTitle("Conversor de unidades");
            menuStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}