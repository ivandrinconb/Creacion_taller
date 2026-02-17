module co.edu.uniquindio.taller.tallerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.taller.tallerapp to javafx.fxml;
    exports co.edu.uniquindio.taller.tallerapp;
}