package com.calculadora.calculadora.Cors; // Asegúrate de que esté en el paquete adecuado

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite todas las rutas y los orígenes indicados
        registry.addMapping("/**") // Permite todas las rutas
                .allowedOrigins("http://localhost", "http://localhost:80", "http://localhost:51430") // Cambia esto por la URL de tu frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos permitidos
                .allowedHeaders("*"); // Permite todos los encabezados
    }
}

