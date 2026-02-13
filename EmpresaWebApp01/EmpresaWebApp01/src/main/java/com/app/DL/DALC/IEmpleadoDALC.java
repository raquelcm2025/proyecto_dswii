package com.app.DL.DALC;

import java.util.List;
import com.app.BL.BE.EmpleadoBE;

public interface IEmpleadoDALC {

    public List<EmpleadoBE> listarEmpleados();
    public int insertarEmpleado(EmpleadoBE empleadoBE);
    public EmpleadoBE obtenerPorID(int id);
    public boolean actualizarEmpleado(EmpleadoBE empleadoBE);
    public boolean eliminarEmpleado(int id);
}