package com.bedu.proyecto.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Adminsitrador implements Serializable {
    private String nombre;
    private String correoElectronico;
    private String rol;
}
