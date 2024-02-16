package com.bedu.proyecto.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo implements Serializable {

    private String prestamo;
    private String devolucion;
    private String usuario;
}
