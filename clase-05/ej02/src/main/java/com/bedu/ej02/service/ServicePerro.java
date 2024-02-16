package com.bedu.ej02.service;

import com.bedu.ej02.modelo.Perro;
import org.springframework.stereotype.Service;

@Service
public class ServicePerro {
    public Perro obtenerPerro(int id){
        Perro perro = new Perro();
        perro.setId(id);
        perro.setNombre("Nombre "+id);
        perro.setComidaFavorita("ComidaFavorita " + id );
        perro.setEdad(15);
        return perro;

    }

    public void guardaPerro(Perro perro){
        System.out.println("Guardando perro" + perro.getNombre());
    }
}
