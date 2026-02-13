package com.app.DL.DALC;

import java.util.List;
import com.app.BL.BE.VentaBE;

public interface IVentaDALC {

    public List<VentaBE> listarVentas();
    public int insertarVenta(VentaBE ventaBE);
    public VentaBE obtenerPorID(int id);
    public boolean actualizarVenta(VentaBE ventaBE);
    public boolean eliminarVenta(int id);
}