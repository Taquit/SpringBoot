package com.bedu.ex2.controller;

import com.bedu.ex2.model.Usuarios;
import com.bedu.ex2.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/api/usuario")
public class UsuarioController {
    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/")
    public Map<Long, Usuarios> getUsuarios(){
        return usuariosService.obtenerUsuarios();
    }
    @PostMapping("/{id}")
    public Usuarios crearUsuario(@PathVariable Long id, @RequestBody Usuarios usuario){
        return usuariosService.crearUsuario(id,usuario);
    }
    @GetMapping("/{id}")
    public Usuarios obtenerUsuario(@PathVariable Long id){
        return usuariosService.obtenerUsuario(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity <Usuarios> actualizarUsuario(@PathVariable Long id, @RequestBody Usuarios usuario){
        Usuarios actualizarUsuario = usuariosService.actualizarUsuario(id,usuario);
        if (actualizarUsuario!=null){
            return ResponseEntity.ok(actualizarUsuario);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity <Usuarios> eliminarUsuario(@PathVariable Long id){
        boolean eliminarUsuario = usuariosService.eliminarUsuario(id);
        if (eliminarUsuario){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
