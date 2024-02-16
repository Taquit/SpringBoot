package com.bedu.ej01.controller;

import com.bedu.ej01.model.Producto;
import com.bedu.ej01.service.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ServiceProducto servicioProducto;

    @GetMapping
    public Producto obtenerProducto(int id){
        return servicioProducto.obtenerProducto(id);
    }
}
