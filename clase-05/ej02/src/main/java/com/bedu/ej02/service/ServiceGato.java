package com.bedu.ej02.service;

import com.bedu.ej02.modelo.Gato;
import org.springframework.stereotype.Service;

//Como crear un nuevo Gato?
//Porque si en el set id es 20 en el urlpuedo poner14 y me devuleve gato ?
@Service
public class ServiceGato {

    public Gato obtenerGato(int id ){
        Gato gato = new Gato();
        gato.setId(20);
        gato.setNombre("Michi" + id);
        gato.setEdad(12 + id);
        gato.setComidaFavorita("Comida favorita" + id);
        return gato;
    }

    public void guardarGato(Gato gato){
        System.out.println("Guardando gato "+gato.getNombre());
    }
}
