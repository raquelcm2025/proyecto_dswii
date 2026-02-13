package com.app.BL.BC;

import java.util.List;

import com.app.BL.BE.EmpleadoBE;
import com.app.DL.DALC.IEmpleadoDALC;
import com.app.DL.DALC.EmpleadoDALC;

public class EmpleadoBC {

    private IEmpleadoDALC EmpleadoDALC = new EmpleadoDALC();

    public List<EmpleadoBE> listarEmpleados() {
        return EmpleadoDALC.listarEmpleados();
    }

    public EmpleadoBE obtenerPorID(int id) {
        return EmpleadoDALC.obtenerPorID(id);
    }

    public int insertarEmpleado(EmpleadoBE empleadoBE) {
        return EmpleadoDALC.insertarEmpleado(empleadoBE);
    }

    public boolean actualizarEmpleado(EmpleadoBE empleadoBE) {
        return EmpleadoDALC.actualizarEmpleado(empleadoBE);
    }

    public boolean eliminarEmpleado(int id) {
        return EmpleadoDALC.eliminarEmpleado(id);
    }
}