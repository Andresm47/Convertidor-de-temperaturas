package application;
//Se importan las librerias necesarias para el funcionamiento de la aplicacion, como JavaFX.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.paths;


//La clase App hereda la clase Application de JavaFX, lo que permite crear una aplicación gráfica.
public class App extends Application {

//Se inicia la el código para ejecutan la pantalla que vamos a mostrar graficamente
        public static void main(String[] args) {
            launch();
        }

    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane load = FXMLLoader.load(getClass().getResource(paths.PANTALLA_INICIAL));
        Scene scene = new Scene(load);
        stage.setTitle("Conversor de unidades");
        stage.setScene(scene);
        stage.show();
    }
}
