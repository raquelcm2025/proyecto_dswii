package com.app.BL.BC;

import java.util.List;

import com.app.BL.BE.VentaBE;
import com.app.DL.DALC.IVentaDALC;
import com.app.DL.DALC.VentaDALC;

public class VentaBC {

    private IVentaDALC VentaDALC = new VentaDALC();

    public List<VentaBE> listarVentas() {
        return VentaDALC.listarVentas();
    }

    public VentaBE obtenerPorID(int id) {
        return VentaDALC.obtenerPorID(id);
    }

    public int insertarVenta(VentaBE ventaBE) {
        return VentaDALC.insertarVenta(ventaBE);
    }

    public boolean actualizarVenta(VentaBE ventaBE) {
        return VentaDALC.actualizarVenta(ventaBE);
    }

    public boolean eliminarVenta(int id) {
        return VentaDALC.eliminarVenta(id);
    }
}