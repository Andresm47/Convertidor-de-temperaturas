package controllers;

import application.Operaciones;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Menu_principalController {

    @FXML
    private Button tempe;

    @FXML
    void click(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Abrir la nueva ventana de medidas
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Pantalla_medidas.fxml"));
            Stage thirdStage = new Stage();
            Pane root = fxmlLoader.load();
            Scene scene = new Scene(root);

            thirdStage.setScene(scene);
            thirdStage.setTitle("Conversor de Medidas");
            thirdStage.show();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    void clicktemp(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Abrir la nueva ventana de temperaturas
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Pantalla inicial.fxml"));
            Stage secondStage = new Stage();
            Pane root = fxmlLoader.load();
            Scene scene = new Scene(root);

            secondStage.setScene(scene);
            secondStage.setTitle("Conversor de Temperaturas");
            secondStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
