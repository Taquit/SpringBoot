package com.bedu.ej1.repository;

import com.bedu.ej1.model.Tarea;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.Map;

@Service
public class TareaService {
    Map <Long, Tarea> tareas = new HashMap<>();
    public  Tarea crearTrea(Long id, Tarea tarea){
        tareas.put(id,tarea);
        return tarea;
    }
    public Tarea obtenerTarea(Long id){
        return tareas.get(id);
    }
    public Map<Long,Tarea> obtenerTareas(){
        return tareas;
    }
    public Tarea actualizarTarea(Long id,Tarea tarea){
        if (tareas.containsKey(id)){
            tareas.put(id,tarea);
            return tarea;

        }else {
            return null;
        }
    }
    public Tarea eliminarTarea(Long id){
        if (tareas.containsKey(id)){
            return tareas.remove(id);

        }else {
            return null;
        }
    }
}
