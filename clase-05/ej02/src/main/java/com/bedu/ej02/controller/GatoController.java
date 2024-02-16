package com.bedu.ej02.controller;

import com.bedu.ej02.modelo.Gato;
import com.bedu.ej02.service.ServiceGato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gato")
public class GatoController {
    @Autowired
    private  ServiceGato serviceGato;

    @GetMapping
    public  Gato obtenerGato(int id){
        return serviceGato.obtenerGato(id);
    }
}
