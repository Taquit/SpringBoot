package com.bedu.proyecto.controller;

import com.bedu.proyecto.model.Usuario;
import com.bedu.proyecto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public Map<Long,Usuario> obtenerAllUsuario(){
        return  usuarioService.obtenerAllUsuarios();
    }
    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable Long id){
        return usuarioService.obtenerUsuario(id);

    }
    @PostMapping("/{id}")
    public Usuario crearUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.crearUsuario(id,usuario);
    }
    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.actualizarUsuario(id,usuario);
    }
    @DeleteMapping("/{id}")
    public Usuario eliminarUsuario(@PathVariable Long id){
        return usuarioService.eliminarUsuario(id);
    }


}
