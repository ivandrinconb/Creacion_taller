package co.edu.uniquindio.taller.tallerapp.controller;

import co.edu.uniquindio.taller.tallerapp.model.Bicicleta;
import co.edu.uniquindio.taller.tallerapp.model.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class BicicletaController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtCliente;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtSerial;

    @FXML
    void RegistrarBicicleta(ActionEvent event) {
        AgregarBicicleta();

    }

    @FXML
    void initialize() {

    }

    @FXML
    private void AgregarBicicleta() {
        Bicicleta bicicleta = new Bicicleta();

        bicicleta.setColor(txtColor.getText());
        bicicleta.setMarca(txtMarca.getText());
        bicicleta.setModelo(Integer.parseInt(txtModelo.getText()));
        bicicleta.setSerial(txtSerial.getText());
        bicicleta.setCliente(txtCliente.getText());

        txtArea.setText(bicicleta.toString());

    }


}
