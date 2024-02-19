package com.bedu.proyecto.service;
import com.bedu.proyecto.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {
    Map<Long, Usuario> usuarios = new HashMap<>();

    public Usuario crearUsuario(Long id, Usuario usuario){
        usuarios.put(id, usuario);
        return usuario;
    }
    public Usuario actualizarUsuario(Long id, Usuario usuario){
        usuarios.put(id,usuario);
        return usuario;
    }
    public Usuario obtenerUsuario(Long id){
        return usuarios.get(id);
    }
    public Map<Long,Usuario> obtenerAllUsuarios(){
        return usuarios;
    }
    public Usuario eliminarUsuario(Long id){
        return usuarios.remove(id);
    }

}
