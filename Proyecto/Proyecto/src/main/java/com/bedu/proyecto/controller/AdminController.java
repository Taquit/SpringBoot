package com.bedu.proyecto.controller;

import com.bedu.proyecto.model.Adminsitrador;
import com.bedu.proyecto.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    public AdministradorService adminService;

    @PostMapping("/{id}")
    public Adminsitrador crearAdmin(@PathVariable Long id, @RequestBody Adminsitrador adminsitrador){
        return adminService.crearAdmin(id, adminsitrador);
    }
    @PutMapping("/{id}")
    public Adminsitrador actualizarAdmi(@PathVariable Long id,@RequestBody Adminsitrador adminsitrador){
        return adminService.actualizarAdmin(id, adminsitrador);
    }
    @GetMapping("/{id}")
    public Adminsitrador obtenerAdmin(@PathVariable Long id){
        return adminService.obtenerAdmin(id);
    }
    @GetMapping("/")
    public Map<Long, Adminsitrador> getAllAdmins(){
        return adminService.getAllAdmin();
    }
    @DeleteMapping("{id}")
    public Adminsitrador eliminarAdmin(@PathVariable Long id){
        return adminService.eliminarAdmin(id);
    }
}
