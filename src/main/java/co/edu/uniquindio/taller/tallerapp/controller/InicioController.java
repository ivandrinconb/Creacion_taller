package co.edu.uniquindio.taller.tallerapp.controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import co.edu.uniquindio.taller.tallerapp.TallerApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class InicioController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegistroBicicleta;

    @FXML
    private Button btnRegistroClientes;

    @FXML
    private Button btnRegistroMecanico;

    @FXML
    private Button btnRegistroOrden;

    @FXML
    void RegistroBicicletas(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/co/edu/uniquindio/taller/tallerapp/BicicletaView.fxml")
            );
            Parent root = loader.load();


            Stage stage = new Stage();
            stage.setTitle("Registro de Bicicletas");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No se pudo abrir la ventana de Bicicletas.");
            alert.showAndWait();
        }

    }

    @FXML
    void RegistroClientes(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/co/edu/uniquindio/taller/tallerapp/ClienteView.fxml")
            );
            Parent root = loader.load();


            Stage stage = new Stage();
            stage.setTitle("Registro de Clientes");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No se pudo abrir la ventana de Cliente.");
            alert.showAndWait();
        }
    }

    @FXML
    void RegistroMecanicos(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/co/edu/uniquindio/taller/tallerapp/MecanicoView.fxml")
            );
            Parent root = loader.load();


            Stage stage = new Stage();
            stage.setTitle("Registro de Mecanico");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No se pudo abrir la ventana de Mecanicos.");
            alert.showAndWait();
        }

    }

    @FXML
    void RegistroOrden(ActionEvent event) {

    }

    @FXML
    void initialize() {


    }




}
