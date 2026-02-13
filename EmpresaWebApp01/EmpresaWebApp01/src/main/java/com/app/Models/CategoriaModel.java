package com.app.Models;

import java.util.List;

import com.app.BL.BC.CategoriaBC;
import com.app.BL.BE.CategoriaBE;

public class CategoriaModel {

    CategoriaBC categoriaBC = new CategoriaBC();

    public List<CategoriaBE> listarCategorias() {
        return categoriaBC.listarCategorias();
    }

    public CategoriaBE obtenerPorID(int id) {
        return categoriaBC.obtenerPorID(id);
    }

    public boolean eliminarCategoria(int id) {
        return categoriaBC.eliminarCategoria(id);
    }

    public boolean actualizarCategoria(CategoriaBE categoriaBE) {
        return categoriaBC.actualizarCategoria(categoriaBE);
    }

    public int insertarCategoria(CategoriaBE categoriaBE) {
        return categoriaBC.insertarCategoria(categoriaBE);
    }
}