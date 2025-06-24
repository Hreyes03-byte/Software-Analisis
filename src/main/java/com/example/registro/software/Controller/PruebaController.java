package com.example.registro.software.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PruebaController {
    @GetMapping("/prueba")
    public String mostrarPrueba() {
        return "prueba"; // Busca prueba.html en src/main/resources/templates
    }

    @GetMapping("/registroClientes")
    public String mostrarRegistroClientes() {
        return "registroClientes"; // sin .html
    }
}
