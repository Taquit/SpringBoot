package com.bedu.ej02.controller;

import com.bedu.ej02.modelo.Perro;
import com.bedu.ej02.service.ServicePerro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perro")
public class PerroController {
    @Autowired
    private ServicePerro servicePerro;

    @GetMapping
    public Perro obtenerPerro(int id){
        return servicePerro.obtenerPerro(id);
    }
}
