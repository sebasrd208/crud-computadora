package com.mx.canciones.service;

import com.mx.canciones.dominio.Canciones;

import java.util.List;

public interface iCancionesService {

    public Canciones guardar(Canciones cancion);

    public Canciones editar(Canciones cancion);

    public Canciones buscar(int id);

    public void eliminar(int id);

    public List<Canciones> listar();
}
