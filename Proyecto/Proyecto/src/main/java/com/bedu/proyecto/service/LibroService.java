package com.bedu.proyecto.service;

import com.bedu.proyecto.model.Libro;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LibroService {
    Map<Long, Libro> libros = new HashMap<>();

    public Libro crearLibro(Long id,Libro libro){
        libros.put(id,libro);
        return libro;
    }
    public Libro actualizarLibro(Long id,Libro libro){
        libros.put(id, libro);
        return libro;
    }
    public Libro obtenerLibro(Long id){
        return libros.get(id);
    }
    public Map<Long,Libro> getAllBooks(){
        return libros;
    }
    public Libro eliminarLibro(Long id){
        return libros.remove(id);
    }
}
