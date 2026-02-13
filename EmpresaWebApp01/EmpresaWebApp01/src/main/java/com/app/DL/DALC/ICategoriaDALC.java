package com.app.DL.DALC;

import java.util.List;
import com.app.BL.BE.CategoriaBE;

public interface ICategoriaDALC {

    public List<CategoriaBE> listarCategorias();
    public int insertarCategoria(CategoriaBE categoriaBE);
    public CategoriaBE obtenerPorID(int id);
    public boolean actualizarCategoria(CategoriaBE categoriaBE);
    public boolean eliminarCategoria(int id);
}