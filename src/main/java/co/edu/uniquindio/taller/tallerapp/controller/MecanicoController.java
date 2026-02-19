package co.edu.uniquindio.taller.tallerapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.taller.tallerapp.model.Mecanico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MecanicoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtEspecialidad;

    @FXML
    private TextField txtNombre;

    @FXML
    void AgregarMecanico(ActionEvent event) {
        AgregarMecanico();

    }

    @FXML
    void initialize() {

    }
    private void AgregarMecanico(){
        Mecanico mecanico = new Mecanico();

        mecanico.setNombre(txtNombre.getText());
        mecanico.setEspecialidad(txtEspecialidad.getText());
        mecanico.setCodigoInterno(txtCodigo.getText());

        txtArea.setText(mecanico.toString());


    }


}
