package com.app.Models;

import java.util.List;

import com.app.BL.BC.ClienteBC;
import com.app.BL.BE.ClienteBE;

public class ClienteModel {

    ClienteBC clienteBC = new ClienteBC();

    public List<ClienteBE> listarClientes() {
        return clienteBC.listarClientes();
    }

    public ClienteBE obtenerPorID(int id) {
        return clienteBC.obtenerPorID(id);
    }

    public boolean eliminarCliente(int id) {
        return clienteBC.eliminarCliente(id);
    }

    public boolean actualizarCliente(ClienteBE clienteBE) {
        return clienteBC.actualizarCliente(clienteBE);
    }

    public int insertarCliente(ClienteBE clienteBE) {
        return clienteBC.insertarCliente(clienteBE);
    }
}