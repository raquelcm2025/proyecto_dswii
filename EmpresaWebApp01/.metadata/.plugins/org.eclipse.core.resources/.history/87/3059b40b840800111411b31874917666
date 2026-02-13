package com.app.BL.BC;

import java.util.List;

import com.app.BL.BE.DetalleVentaBE;
import com.app.DL.DALC.IDetalleVentaDALC;
import com.app.DL.DALC.DetalleVentaDALC;

public class DetalleVentaBC {

    private IDetalleVentaDALC DetalleVentaDALC = new DetalleVentaDALC();

    public List<DetalleVentaBE> listarDetalleVentas() {
        return DetalleVentaDALC.listarDetalleVentas();
    }

    public DetalleVentaBE obtenerPorID(int id) {
        return DetalleVentaDALC.obtenerPorID(id);
    }

    public int insertarDetalleVenta(DetalleVentaBE detalleVentaBE) {
        return DetalleVentaDALC.insertarDetalleVenta(detalleVentaBE);
    }

    public boolean actualizarDetalleVenta(DetalleVentaBE detalleVentaBE) {
        return DetalleVentaDALC.actualizarDetalleVenta(detalleVentaBE);
    }

    public boolean eliminarDetalleVenta(int id) {
        return DetalleVentaDALC.eliminarDetalleVenta(id);
    }
}