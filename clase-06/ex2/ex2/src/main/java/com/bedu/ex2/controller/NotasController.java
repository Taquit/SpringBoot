package com.bedu.ex2.controller;

import com.bedu.ex2.model.Notas;
import com.bedu.ex2.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/api/notas")
public class NotasController {
    @Autowired
    private NotasService notasService;
    @GetMapping("/")
    public Map<Long, Notas> obtenerAllNotas(){
        return notasService.obtenerAllNotas();
    }
    @GetMapping("/{id}")
    public Notas obtenerNota(Long id){
        return notasService.obtenerNota(id);
    }
    @PostMapping("/{id}")
    public Notas crearNota(Long id,Notas nota){
        return notasService.crearNota(id, nota);
    }
    @PutMapping("/{id}")
    public Notas actualizarNota(Long id,Notas nota){
        return notasService.actualizarNotas(id,nota);
    }
    @DeleteMapping("/{id}")
    public boolean eliminarNota(Long id){
        return notasService.eliminarNota(id);
    }
}
