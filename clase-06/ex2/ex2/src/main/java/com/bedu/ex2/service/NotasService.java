package com.bedu.ex2.service;

import com.bedu.ex2.model.Notas;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NotasService {
    private final Map<Long, Notas> notas = new HashMap<>();
    public Notas crearNota(Long id,Notas nota){
        return notas.put(id,nota);

    }
    public Notas obtenerNota(Long id){
        return notas.get(id);
    }
    public Map<Long,Notas> obtenerAllNotas(){
        return notas;
    }
    public Notas actualizarNotas(Long id,Notas nota){
        notas.put(id, nota);
        return nota;
    }
    public boolean eliminarNota(Long id){
        return notas.remove(id) != null;
    }
}
