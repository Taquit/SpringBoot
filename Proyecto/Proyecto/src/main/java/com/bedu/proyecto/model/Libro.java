package com.bedu.proyecto.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean prestado;
}
