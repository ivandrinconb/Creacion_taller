module co.edu.uniquindio.taller.tallerapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens co.edu.uniquindio.taller.tallerapp to javafx.fxml;
    exports co.edu.uniquindio.taller.tallerapp;

    opens  co.edu.uniquindio.taller.tallerapp.controller;
    exports co.edu.uniquindio.taller.tallerapp.controller;

    opens  co.edu.uniquindio.taller.tallerapp.model;
    exports co.edu.uniquindio.taller.tallerapp.model;
}