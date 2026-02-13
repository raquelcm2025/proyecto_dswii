package com.app.DL.DALC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.BL.BE.EmpleadoBE;
import com.app.Config.BDConexion;

public class EmpleadoDALC implements IEmpleadoDALC {

    @Override
    public List<EmpleadoBE> listarEmpleados() {
        List<EmpleadoBE> empleados = null;
        Connection con = null;

        try {
            con = BDConexion.getConexion();
            CallableStatement cs = con.prepareCall("{call USP_ListarEmpleados}");
            ResultSet rs = cs.executeQuery();

            empleados = new ArrayList<EmpleadoBE>();

            while (rs.next()) {
                EmpleadoBE emp = new EmpleadoBE();
                emp.setId(rs.getInt(1));
                emp.setNombre(rs.getString(2));
                emp.setCargo(rs.getString(3));
                emp.setTelefono(rs.getString(4));
                empleados.add(emp);
            }

            rs.close();
            cs.close();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try { if(con != null) con.close(); } catch(Exception e) {}
        }

        return empleados;
    }

    @Override
    public int insertarEmpleado(EmpleadoBE empleadoBE) {
        return 0;
    }

    @Override
    public EmpleadoBE obtenerPorID(int id) {
        return null;
    }

    @Override
    public boolean actualizarEmpleado(EmpleadoBE empleadoBE) {
        return false;
    }

    @Override
    public boolean eliminarEmpleado(int id) {
        return false;
    }
}