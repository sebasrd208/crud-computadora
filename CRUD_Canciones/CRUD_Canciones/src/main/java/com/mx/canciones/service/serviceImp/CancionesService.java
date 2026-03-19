package com.mx.canciones.service.serviceImp;

import com.mx.canciones.dao.iCancionesDAO;
import com.mx.canciones.dominio.Canciones;
import com.mx.canciones.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancionesService implements iCancionesService {

    @Autowired
    iCancionesDAO dao;

    @Override
    public Canciones guardar(Canciones cancion) {
        return dao.save(cancion);
    }

    @Override
    public Canciones editar(Canciones cancion) {
        return dao.save(cancion);
    }

    @Override
    public Canciones buscar(int id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void eliminar(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<Canciones> listar() {
        return dao.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public List<Canciones> buscarArtista(String artista){
        return dao.findByArtistaIgnoreCase(artista);
    }

    public List<Canciones> buscarEstreno(int estreno){
        return dao.findByEstreno(estreno);
    }
}
