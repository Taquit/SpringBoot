package com.bedu.ej01.controller;


import com.bedu.ej01.service.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class UsuarioController {

    @Autowired
    private final ServicioUsuario servicioUsuario;

    public UsuarioController(ServicioUsuario servicioUsuario){
        this.servicioUsuario = servicioUsuario;
    }

}
