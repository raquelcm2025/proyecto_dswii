package com.app.DL.DALC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.BL.BE.ClienteBE;
import com.app.Config.BDConexion;

public class ClienteDALC implements IClienteDALC {

    @Override
    public List<ClienteBE> listarClientes() {
        List<ClienteBE> clientes = null;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_ListarClientes}");
            ResultSet rs = cs.executeQuery();

            clientes = new ArrayList<ClienteBE>();

            while (rs.next()) {
                ClienteBE cliente = new ClienteBE();
                cliente.setId(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setTelefono(rs.getString(3));
                clientes.add(cliente);
            }

            rs.close();
            cs.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try { if(con != null) con.close(); } catch(Exception e) {}
        }

        return clientes;
    }

    @Override
    public int insertarCliente(ClienteBE clienteBE) {
        int resultado = 0;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_InsertarCliente(?,?)}");

            cs.setString(1, clienteBE.getNombre());
            cs.setString(2, clienteBE.getTelefono());

            resultado = cs.executeUpdate();
            cs.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try { if(con != null) con.close(); } catch(Exception e) {}
        }

        return resultado;
    }

    @Override
    public ClienteBE obtenerPorID(int id) {
        return null;
    }

    @Override
    public boolean actualizarCliente(ClienteBE clienteBE) {
        return false;
    }

    @Override
    public boolean eliminarCliente(int id) {
        return false;
    }
}