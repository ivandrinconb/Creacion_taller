package co.edu.uniquindio.taller.tallerapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class TallerApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TallerApp.class.getResource("Inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("App Taller");
        stage.setScene(scene);
        stage.show();
    }


}
