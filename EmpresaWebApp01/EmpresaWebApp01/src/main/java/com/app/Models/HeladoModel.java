package com.app.Models;

import java.util.List;

import com.app.BL.BC.HeladoBC;
import com.app.BL.BE.HeladoBE;

public class HeladoModel {

    HeladoBC heladoBC = new HeladoBC();

    public List<HeladoBE> listarHelados() {
        return heladoBC.listarHelados();
    }

    public HeladoBE obtenerPorID(int id) {
        return heladoBC.obtenerPorID(id);
    }

    public boolean eliminarHelado(int id) {
        return heladoBC.eliminarHelado(id);
    }

    public boolean actualizarHelado(HeladoBE heladoBE) {
        return heladoBC.actualizarHelado(heladoBE);
    }

    public int insertarHelado(HeladoBE heladoBE) {
        return heladoBC.insertarHelado(heladoBE);
    }
}