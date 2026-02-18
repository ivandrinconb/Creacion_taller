package co.edu.uniquindio.taller.tallerapp.service;

import co.edu.uniquindio.taller.tallerapp.model.Cliente;
import co.edu.uniquindio.taller.tallerapp.repository.DataStore;

public class TallerService {
    public void registrarCliente(Cliente c) {

        DataStore.clientes.add(c);
    }

}
