package com.app.BL.BE;

public class DetalleVentaBE {
    private int Id;
    private int VentaId;
    private int HeladoId;
    private int Cantidad;
    private double PrecioUnitario;

    public DetalleVentaBE() {}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getVentaId() {
        return VentaId;
    }

    public void setVentaId(int ventaId) {
        VentaId = ventaId;
    }

    public int getHeladoId() {
        return HeladoId;
    }

    public void setHeladoId(int heladoId) {
        HeladoId = heladoId;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        PrecioUnitario = precioUnitario;
    }
}