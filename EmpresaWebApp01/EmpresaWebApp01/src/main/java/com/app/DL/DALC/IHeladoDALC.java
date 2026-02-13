package com.app.DL.DALC;

import java.util.List;
import com.app.BL.BE.HeladoBE;

public interface IHeladoDALC {

    public List<HeladoBE> listarHelados();
    public int insertarHelado(HeladoBE heladoBE);
    public HeladoBE obtenerPorID(int id);
    public boolean actualizarHelado(HeladoBE heladoBE);
    public boolean eliminarHelado(int id);
}