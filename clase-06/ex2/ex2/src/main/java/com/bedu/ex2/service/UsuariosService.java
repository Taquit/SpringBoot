package com.bedu.ex2.service;

import com.bedu.ex2.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuariosService {
    private final  Map <Long, Usuarios> usuarios = new HashMap<>();
    public Usuarios crearUsuario(Long id, Usuarios usuario){
        return usuarios.put(id,usuario);

    }
    public boolean eliminarUsuario(Long id){
        return usuarios.remove(id)!=null;
    }
    public Usuarios obtenerUsuario(Long id){
        return usuarios.get(id);
    }
    public Map<Long,Usuarios> obtenerUsuarios(){
        return usuarios;
    }
    public Usuarios actualizarUsuario(Long id, Usuarios usuario){
        if (usuarios.containsKey(id)){
            usuarios.put(id,usuario);
            return usuario;
        }else {
            return null;
        }
    }
}
