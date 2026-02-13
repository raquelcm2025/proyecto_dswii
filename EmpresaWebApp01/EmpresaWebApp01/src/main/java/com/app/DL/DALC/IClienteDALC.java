package com.app.DL.DALC;

import java.util.List;
import com.app.BL.BE.ClienteBE;

public interface IClienteDALC {

    public List<ClienteBE> listarClientes();
    public int insertarCliente(ClienteBE clienteBE);
    public ClienteBE obtenerPorID(int id);
    public boolean actualizarCliente(ClienteBE clienteBE);
    public boolean eliminarCliente(int id);
}