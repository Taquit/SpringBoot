package com.bedu.proyecto.service;

import com.bedu.proyecto.model.Adminsitrador;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AdministradorService {
        Map<Long,Adminsitrador> administrador = new HashMap<>();
        public Adminsitrador crearAdmin(Long id, Adminsitrador adminsitrador){
            administrador.put(id,adminsitrador);
            return adminsitrador;
        }
}
