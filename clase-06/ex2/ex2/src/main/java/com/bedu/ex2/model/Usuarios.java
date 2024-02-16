package com.bedu.ex2.model;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Usuarios implements Serializable {
    private String nombre;
    private String apellido;
    private String puesto;
    private int edad;

}
