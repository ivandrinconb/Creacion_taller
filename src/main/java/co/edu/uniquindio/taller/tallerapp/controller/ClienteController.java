package co.edu.uniquindio.taller.tallerapp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.taller.tallerapp.model.Cliente;
import co.edu.uniquindio.taller.tallerapp.model.TipoBicicleta;
import co.edu.uniquindio.taller.tallerapp.repository.DataStore;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;





public class ClienteController {

    private final ObservableList<Cliente> clientesObs = FXCollections.observableArrayList();

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
        guardarCliente();


    }

    @FXML
    void initialize() {

        chTipoBicicleta.setItems(FXCollections.observableArrayList(TipoBicicleta.values()));
        chTipoBicicleta.setValue(TipoBicicleta.MTB);
        tcNombre.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getNombre()));
        tcIdentificacion.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getIdentificacion()));
        tcTelefono.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getTelefono()));
        tcDireccion.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getDireccion()));

        clientesObs.setAll(DataStore.clientes);
        tableCliente.setItems(clientesObs);




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
        boolean yaExiste = DataStore.clientes.stream()
                .anyMatch(c -> c.getIdentificacion().equalsIgnoreCase(identificacion));

        if (yaExiste) {
            alerta(Alert.AlertType.ERROR, "Duplicado", "Ya existe un cliente con esa identificación.");
            return;
        }

        Cliente nuevo = new Cliente(nombre, identificacion, telefono, direccion, tipoSeleccionado);
        DataStore.clientes.add(nuevo);

        clientesObs.setAll(DataStore.clientes);
        limpiarFormulario();

        alerta(Alert.AlertType.INFORMATION, "Guardado", "Cliente registrado correctamente.");
    }

    @FXML
    private void limpiarFormulario() {
        txtNombre.clear();
        txtIdentificacion.clear();
        txtTelefono.clear();
        txtDireccion.clear();
        txtNombre.requestFocus();
    }

    private void alerta(Alert.AlertType type, String titulo, String msg) {
        Alert a = new Alert(type);
        a.setTitle(titulo);
        a.setHeaderText(null);
        a.setContentText(msg);
        a.showAndWait();
        }
}

