package com.app.DL.DALC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.BL.BE.HeladoBE;
import com.app.Config.BDConexion;

public class HeladoDALC implements IHeladoDALC {

    @Override
    public List<HeladoBE> listarHelados() {
        List<HeladoBE> helados = null;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_ListarHelados}");
            ResultSet rs = cs.executeQuery();

            helados = new ArrayList<HeladoBE>();

            while (rs.next()) {
                HeladoBE heladoBE = new HeladoBE();
                heladoBE.setId(rs.getInt(1));
                heladoBE.setNombre(rs.getString(2));
                heladoBE.setSabor(rs.getString(3));
                heladoBE.setPrecio(rs.getDouble(4));
                heladoBE.setStock(rs.getInt(5));
                heladoBE.setCategoriaId(rs.getInt(6));

                helados.add(heladoBE);
            }

            rs.close();
            cs.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(con != null)
                    con.close();
            }
            catch(Exception e) {}
        }

        return helados;
    }

    @Override
    public int insertarHelado(HeladoBE heladoBE) {
        int resultado = 0;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_InsertarHelado(?,?,?,?,?)}");

            cs.setString(1, heladoBE.getNombre());
            cs.setString(2, heladoBE.getSabor());
            cs.setDouble(3, heladoBE.getPrecio());
            cs.setInt(4, heladoBE.getStock());
            cs.setInt(5, heladoBE.getCategoriaId());

            resultado = cs.executeUpdate();
            cs.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(con != null)
                    con.close();
            }
            catch(Exception e) {}
        }

        return resultado;
    }

    @Override
    public HeladoBE obtenerPorID(int id) {
        HeladoBE heladoBE = null;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_ObtenerHeladoPorID(?)}");

            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();

            if (rs.next()) {
                heladoBE = new HeladoBE();
                heladoBE.setId(rs.getInt(1));
                heladoBE.setNombre(rs.getString(2));
                heladoBE.setSabor(rs.getString(3));
                heladoBE.setPrecio(rs.getDouble(4));
                heladoBE.setStock(rs.getInt(5));
                heladoBE.setCategoriaId(rs.getInt(6));
            }

            rs.close();
            cs.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(con != null)
                    con.close();
            }
            catch(Exception e) {}
        }

        return heladoBE;
    }

    @Override
    public boolean actualizarHelado(HeladoBE heladoBE) {
        boolean resultado = false;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_ActualizarHelado(?,?,?,?,?,?)}");

            cs.setInt(1, heladoBE.getId());
            cs.setString(2, heladoBE.getNombre());
            cs.setString(3, heladoBE.getSabor());
            cs.setDouble(4, heladoBE.getPrecio());
            cs.setInt(5, heladoBE.getStock());
            cs.setInt(6, heladoBE.getCategoriaId());

            resultado = cs.executeUpdate() > 0;
            cs.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(con != null)
                    con.close();
            }
            catch(Exception e) {}
        }

        return resultado;
    }

    @Override
    public boolean eliminarHelado(int id) {
        boolean resultado = false;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_EliminarHelado(?)}");

            cs.setInt(1, id);
            resultado = cs.executeUpdate() > 0;

            cs.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(con != null)
                    con.close();
            }
            catch(Exception e) {}
        }

        return resultado;
    }
}