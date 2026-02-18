package co.edu.uniquindio.taller.tallerapp.repository;

import co.edu.uniquindio.taller.tallerapp.model.Bicicleta;
import co.edu.uniquindio.taller.tallerapp.model.Cliente;
import co.edu.uniquindio.taller.tallerapp.model.Mecanico;
import co.edu.uniquindio.taller.tallerapp.model.OrdenServicio;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Bicicleta> bicicletas = new ArrayList<>();
    public static List<Mecanico> mecanicos = new ArrayList<>();
    public static List<OrdenServicio> ordenes = new ArrayList<>();
}
