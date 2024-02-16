package com.bedu.ej1.model;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Tarea implements Serializable {
    private String nombre;
    private String descripcion;
    private boolean completada;
    private String fechaLimite;

}
