package com.bedu.ej1.controller;

import com.bedu.ej1.model.Tarea;
import com.bedu.ej1.repository.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("api/v1/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping("/")
    public Map<Long, Tarea> getTareas(){
        return tareaService.obtenerTareas();
    }
    @PostMapping("/id")
    public Tarea crearTarea(@PathVariable Long id, @RequestBody Tarea tarea){
        return tareaService.crearTrea(id,tarea);
    }
    @GetMapping("/id")
    public Tarea obtenerTarea(@PathVariable Long id) {
        return tareaService.obtenerTarea(id);
    }
    @PutMapping("/id")
    public ResponseEntity <Tarea> actualizarTarea(@PathVariable Long id, @RequestBody Tarea tarea){
        Tarea tareaActualizada =tareaService.actualizarTarea(id,tarea);
        if (tareaActualizada != null){
            return ResponseEntity.ok(tareaActualizada);
        }else {

            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/id")
    public ResponseEntity<Tarea> eliminarTarea(@PathVariable Long id){
        Tarea tareaEliminada =tareaService.eliminarTarea(id);
        if (tareaEliminada != null){
            return ResponseEntity.ok(tareaEliminada);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
