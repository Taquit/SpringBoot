package com.bedu.ex2.model;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Notas implements Serializable {
    private String nombre;
    private String fecha;
    private String descripcion;
    private boolean realizada;
}
