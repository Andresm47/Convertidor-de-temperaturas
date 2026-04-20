package controllers;

import application.Operaciones;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class Medidas implements Initializable {
    @FXML
    private TextArea lblfinal;

    @FXML
    private ComboBox<String> unidad;

    @FXML
    private ComboBox<String> unidad2;

    @FXML
    private TextField valor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Se pueden agregar opciones al ComboBox si es necesario
        unidad.setItems(FXCollections.observableArrayList("Metros", "Pies", "Kilómetros", "Millas"));
        unidad2.setItems(FXCollections.observableArrayList("Metros", "Pies", "Kilómetros", "Millas"));
    }

    @FXML
    void click(ActionEvent event) {

        try{
            double numero = Double.parseDouble(valor.getText());
            String medida1 = unidad.getValue();
            String medida2 = unidad2.getValue();

            if (medida1 == null || medida2 == null) {
                 lblfinal.setText("Por favor, selecciona ambas unidades de medida.");
                 return;
            }
            if (medida1.equals("Metros") && medida2.equals("Pies")){
                double metros = Operaciones.MetrosAPies(numero);
                lblfinal.setText(String.format("%.2f", metros) + " Pies \n" );
            } else if (medida1.equals("Pies") && medida2.equals("Metros")) {
                double pies = Operaciones.PiesAMetros(numero);
                lblfinal.setText(String.format("%.2f", pies) + " Metros \n " );
            } else if (medida1.equals("Kilómetros") && medida2.equals("Millas")) {
                double kilometros = Operaciones.kilometrosAMillas(numero);
                lblfinal.setText(String.format("%.2f", kilometros) + " Millas  \n");
            } else if (medida1.equals("Millas") && medida2.equals("Kilómetros")) {
                double millas = Operaciones.millasAKilometros(numero);
                lblfinal.setText(String.format("%.2f", millas) + " Kilómetros \n");
            } else if (medida1.equals("Metros") && medida2.equals("Kilómetros")) {
                double metros = Operaciones.metrosAKilometros(numero);
                lblfinal.setText(String.format("%.2f", metros) + " Kilómetros \n");
            } else if (medida1.equals("Kilómetros") && medida2.equals("Metros")) {
                double kilometros = Operaciones.kilometrosAMetros(numero);
                lblfinal.setText(String.format("%.2f", kilometros) + " Metros \n");
                
            }

        }catch(Exception e){
            lblfinal.setText("Error: Ingresa un número válido");
        }
    }

    @FXML
    void menu(ActionEvent event){
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
