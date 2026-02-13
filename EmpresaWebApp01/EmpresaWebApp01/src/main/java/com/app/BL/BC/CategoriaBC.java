package com.app.BL.BC;

import java.util.List;

import com.app.BL.BE.CategoriaBE;
import com.app.DL.DALC.ICategoriaDALC;
import com.app.DL.DALC.CategoriaDALC;

public class CategoriaBC {

    private ICategoriaDALC CategoriaDALC = new CategoriaDALC();

    public List<CategoriaBE> listarCategorias() {
        return CategoriaDALC.listarCategorias();
    }

    public CategoriaBE obtenerPorID(int id) {
        return CategoriaDALC.obtenerPorID(id);
    }

    public int insertarCategoria(CategoriaBE categoriaBE) {
        return CategoriaDALC.insertarCategoria(categoriaBE);
    }

    public boolean actualizarCategoria(CategoriaBE categoriaBE) {
        return CategoriaDALC.actualizarCategoria(categoriaBE);
    }

    public boolean eliminarCategoria(int id) {
        return CategoriaDALC.eliminarCategoria(id);
    }
}