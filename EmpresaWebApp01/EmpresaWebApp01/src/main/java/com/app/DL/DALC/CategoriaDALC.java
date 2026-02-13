package com.app.DL.DALC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.BL.BE.CategoriaBE;
import com.app.Config.BDConexion;

public class CategoriaDALC implements ICategoriaDALC {

    @Override
    public List<CategoriaBE> listarCategorias() {
        List<CategoriaBE> categorias = null;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_ListarCategorias}");
            ResultSet rs = cs.executeQuery();

            categorias = new ArrayList<CategoriaBE>();

            while (rs.next()) {
                CategoriaBE categoria = new CategoriaBE();
                categoria.setId(rs.getInt(1));
                categoria.setNombre(rs.getString(2));
                categorias.add(categoria);
            }

            rs.close();
            cs.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try { if(con != null) con.close(); } catch(Exception e) {}
        }

        return categorias;
    }

    @Override
    public int insertarCategoria(CategoriaBE categoriaBE) {
        int resultado = 0;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_InsertarCategoria(?)}");

            cs.setString(1, categoriaBE.getNombre());
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
    public CategoriaBE obtenerPorID(int id) {
        CategoriaBE categoria = null;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_ObtenerCategoriaPorID(?)}");

            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();

            if(rs.next()) {
                categoria = new CategoriaBE();
                categoria.setId(rs.getInt(1));
                categoria.setNombre(rs.getString(2));
            }

            rs.close();
            cs.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try { if(con != null) con.close(); } catch(Exception e) {}
        }

        return categoria;
    }

    @Override
    public boolean actualizarCategoria(CategoriaBE categoriaBE) {
        boolean resultado = false;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_ActualizarCategoria(?,?)}");

            cs.setInt(1, categoriaBE.getId());
            cs.setString(2, categoriaBE.getNombre());

            resultado = cs.executeUpdate() > 0;
            cs.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try { if(con != null) con.close(); } catch(Exception e) {}
        }

        return resultado;
    }

    @Override
    public boolean eliminarCategoria(int id) {
        boolean resultado = false;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_EliminarCategoria(?)}");

            cs.setInt(1, id);
            resultado = cs.executeUpdate() > 0;

            cs.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try { if(con != null) con.close(); } catch(Exception e) {}
        }

        return resultado;
    }
}