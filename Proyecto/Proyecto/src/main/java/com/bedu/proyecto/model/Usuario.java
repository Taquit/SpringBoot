package com.bedu.proyecto.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Usuario implements Serializable {
    private String nombre;
    private String correoElectronico;
    private String rol;
}
