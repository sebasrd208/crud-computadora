package com.mx.canciones.dominio;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CANCIONES_BD")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Canciones {

    @Id
    private int id;
    private String nombre;
    private String artista;
    private String genero;
    private int estreno;
}
