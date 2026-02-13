package com.app.BL.BC;

import java.util.List;

import com.app.BL.BE.ClienteBE;
import com.app.DL.DALC.IClienteDALC;
import com.app.DL.DALC.ClienteDALC;

public class ClienteBC {

    private IClienteDALC ClienteDALC = new ClienteDALC();

    public List<ClienteBE> listarClientes() {
        return ClienteDALC.listarClientes();
    }

    public ClienteBE obtenerPorID(int id) {
        return ClienteDALC.obtenerPorID(id);
    }

    public int insertarCliente(ClienteBE clienteBE) {
        return ClienteDALC.insertarCliente(clienteBE);
    }

    public boolean actualizarCliente(ClienteBE clienteBE) {
        return ClienteDALC.actualizarCliente(clienteBE);
    }

    public boolean eliminarCliente(int id) {
        return ClienteDALC.eliminarCliente(id);
    }
}