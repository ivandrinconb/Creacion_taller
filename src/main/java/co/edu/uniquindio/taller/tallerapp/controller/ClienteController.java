package co.edu.uniquindio.taller.tallerapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.taller.tallerapp.model.Cliente;
import co.edu.uniquindio.taller.tallerapp.model.TipoBicicleta;
import co.edu.uniquindio.taller.tallerapp.repository.DataStore;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;



public class ClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGuardar;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private ChoiceBox<TipoBicicleta> chTipoBicicleta;

    @FXML
    private TableView<Cliente> tableCliente;

    @FXML
    private TableColumn<Cliente, String> tcDireccion;

    @FXML
    private TableColumn<Cliente, String> tcIdentificacion;

    @FXML
    private TableColumn<Cliente, String> tcNombre;

    @FXML
    private TableColumn<Cliente, String> tcTelefono;

    @FXML
    private TableColumn<Cliente, String> tcTipoBicicleta;


    @FXML
    void onGuardarCliente(ActionEvent event) {


    }

    @FXML
    void initialize() {


    }

    private void guardarCliente() {
        String nombre = txtNombre.getText();
        String identificacion = txtIdentificacion.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();

        TipoBicicleta tipoSeleccionado = chTipoBicicleta.getValue();
        String tipoBicicletaStr = tipoSeleccionado != null ? tipoSeleccionado.name() : null;

        if (nombre.isEmpty() || identificacion.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            alerta(Alert.AlertType.WARNING, "Campos incompletos", "Por favor llena todos los campos.");
            return;
    }

        private void alerta(Alert.AlertType type, String titulo, String msg) {
            Alert a = new Alert(type);
            a.setTitle(titulo);
            a.setHeaderText(null);
            a.setContentText(msg);
            a.showAndWait();
        }
}

