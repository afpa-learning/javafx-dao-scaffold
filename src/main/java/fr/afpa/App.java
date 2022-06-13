package fr.afpa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("version"));
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        // Fermeture de la connexion à la base de données
        // TODO à décommenter une fois l'accès à la base réparé
        /* Connection connection = ConnectionMariaDb.getInstance();

        try {
            connection.close();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        } */
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}