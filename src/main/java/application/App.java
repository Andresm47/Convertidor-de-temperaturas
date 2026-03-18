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
            launch(args);
        }

    @Override
//Se da inicio a la aplicación, se carga el archivo FXML que contiene la interfaz gráfica y se muestra en la ventana principal.
    public void start(Stage stage) throws Exception {
// Se carga el archivo FXML que contiene la interfaz gráfica y se muestra en la ventana principal.
        AnchorPane load = FXMLLoader.load(getClass().getResource(paths.PANTALLA_INICIAL));
// Se carga la escena que es donde se encuentran todos los campos que vamos a usar
        Scene scene = new Scene(load);
// Se establece el título de la ventana principal y se muestra la escena.
        stage.setTitle("Conversor de unidades");
        stage.setScene(scene);
        stage.show();
    }
}
