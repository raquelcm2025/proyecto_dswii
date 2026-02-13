package com.app.DL.DALC;

import java.util.List;
import com.app.BL.BE.DetalleVentaBE;

public interface IDetalleVentaDALC {

    public List<DetalleVentaBE> listarDetalleVentas();
    public int insertarDetalleVenta(DetalleVentaBE detalleVentaBE);
    public DetalleVentaBE obtenerPorID(int id);
    public boolean actualizarDetalleVenta(DetalleVentaBE detalleVentaBE);
    public boolean eliminarDetalleVenta(int id);
}