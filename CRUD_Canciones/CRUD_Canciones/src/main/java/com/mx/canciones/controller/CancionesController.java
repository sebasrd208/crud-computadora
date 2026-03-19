package com.mx.canciones.controller;

import com.mx.canciones.dominio.Canciones;
import com.mx.canciones.service.serviceImp.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import java.util.List;

@RestController
@RequestMapping("canciones")
public class CancionesController {

    @Autowired
    private CancionesService service;


    @GetMapping("listar")
    public List<Canciones> listar(){
        return service.listar();
    }

    @PostMapping("guardar")
    public Canciones guardar(@RequestBody Canciones cancion) {
        return service.guardar(cancion);
    }

    @GetMapping("buscar/{id}")
    public Canciones buscar(@PathVariable int id) {
        return service.buscar(id);
    }

    @PutMapping("editar")
    public Canciones editar(@RequestBody Canciones cancion) {
        return service.editar(cancion);
    }

    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }

    @GetMapping("buscar-artista/{artista}")
    public List<Canciones> buscarPorNombre(@PathVariable String artista) {
        return service.buscarArtista(artista);
    }

    @GetMapping("buscar-estreno")
    public List<Canciones> buscarPorEstreno(@RequestParam int estreno) {
        return service.buscarEstreno(estreno);
    }

}
