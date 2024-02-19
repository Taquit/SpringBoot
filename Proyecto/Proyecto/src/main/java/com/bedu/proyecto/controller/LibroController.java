package com.bedu.proyecto.controller;

import com.bedu.proyecto.model.Libro;
import com.bedu.proyecto.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/libro")
public class LibroController {
    @Autowired
    LibroService libroService;
    @GetMapping("/")
    public Map<Long,Libro> getAllLibros(){
        return libroService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Libro obtenerLibro(Long id){
        return libroService.obtenerLibro(id);
    }

    @PostMapping("/{id}")
    public Libro crearLibro(@PathVariable Long id, @RequestBody Libro libro){
        return libroService.crearLibro(id,libro);
    }
    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable Long id,@RequestBody Libro libro){
        return libroService.actualizarLibro(id, libro);
    }
    @DeleteMapping("/{id}")
    public Libro eliminarLibro(@PathVariable Long id){
        return libroService.eliminarLibro(id);
    }
}
