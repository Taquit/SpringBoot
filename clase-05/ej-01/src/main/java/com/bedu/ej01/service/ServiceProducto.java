package com.bedu.ej01.service;

import com.bedu.ej01.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceProducto {
    public Producto obtenerProducto(int id){
        Producto producto = new Producto();
        producto.setId(id);
        producto.setNombre("Producto"+id);
        producto.setDescripcion("Descripcion"+id );
        producto.setPrecio(100 + id);
        return producto;
    }

    public void guardaProducto(Producto producto){
        System.out.println("Guaradando producto" + producto.getNombre());
    }
}
