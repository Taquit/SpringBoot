package org.example.postwork.controller;

import org.example.postwork.modelo.Nombre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreController {

    @GetMapping("/nombre")

    public Nombre nombre(){
        Nombre nombre = new Nombre();
        nombre.setNombre("Ruben");

        return nombre;
    }
}
