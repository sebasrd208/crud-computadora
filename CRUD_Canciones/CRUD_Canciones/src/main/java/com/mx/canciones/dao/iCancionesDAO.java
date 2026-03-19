package com.mx.canciones.dao;

import java.util.*;
import com.mx.canciones.dominio.*;
import org.springframework.data.jpa.repository.*;

public interface iCancionesDAO extends JpaRepository<Canciones, Integer> {

    public List<Canciones> findByArtistaIgnoreCase(String nombre);
    public List<Canciones> findByEstreno(int estreno);
}
