package com.bedu.ej01.config;

import com.bedu.ej01.model.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {
    @Bean
    public Usuario usuario(){
        return new Usuario();
    }
}
