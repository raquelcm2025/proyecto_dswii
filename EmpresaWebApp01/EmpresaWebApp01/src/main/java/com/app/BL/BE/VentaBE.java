package com.app.BL.BE;

import java.util.Date;

public class VentaBE {
    private int Id;
    private Date Fecha;
    private double Total;
    private int ClienteId;
    private int EmpleadoId;

    public VentaBE() {}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public int getClienteId() {
        return ClienteId;
    }

    public void setClienteId(int clienteId) {
        ClienteId = clienteId;
    }

    public int getEmpleadoId() {
        return EmpleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        EmpleadoId = empleadoId;
    }
}