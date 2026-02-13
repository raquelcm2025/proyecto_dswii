package com.app.Models;

import java.util.List;

import com.app.BL.BC.EmpleadoBC;
import com.app.BL.BE.EmpleadoBE;

public class EmpleadoModel {

    EmpleadoBC empleadoBC = new EmpleadoBC();

    public List<EmpleadoBE> listarEmpleados() {
        return empleadoBC.listarEmpleados();
    }

    public EmpleadoBE obtenerPorID(int id) {
        return empleadoBC.obtenerPorID(id);
    }

    public boolean eliminarEmpleado(int id) {
        return empleadoBC.eliminarEmpleado(id);
    }

    public boolean actualizarEmpleado(EmpleadoBE empleadoBE) {
        return empleadoBC.actualizarEmpleado(empleadoBE);
    }

    public int insertarEmpleado(EmpleadoBE empleadoBE) {
        return empleadoBC.insertarEmpleado(empleadoBE);
    }
}