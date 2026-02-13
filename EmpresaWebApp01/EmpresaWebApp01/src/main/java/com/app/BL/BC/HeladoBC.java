package com.app.BL.BC;

import java.util.List;

import com.app.BL.BE.HeladoBE;
import com.app.DL.DALC.IHeladoDALC;
import com.app.DL.DALC.HeladoDALC;

public class HeladoBC {

    private IHeladoDALC HeladoDALC = new HeladoDALC();

    // métodos CRUD
    public List<HeladoBE> listarHelados() {
        return HeladoDALC.listarHelados();
    }

    public HeladoBE obtenerPorID(int id) {
        return HeladoDALC.obtenerPorID(id);
    }

    public int insertarHelado(HeladoBE heladoBE) {
        return HeladoDALC.insertarHelado(heladoBE);
    }

    public boolean actualizarHelado(HeladoBE heladoBE) {
        return HeladoDALC.actualizarHelado(heladoBE);
    }

    public boolean eliminarHelado(int id) {
        return HeladoDALC.eliminarHelado(id);
    }
}