package com.example.registro.software.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PruebaController {
    @GetMapping("/login")
    public String mostrarPrueba() {
        return "prueba"; // Busca prueba.html en src/main/resources/templates
    }

    @GetMapping("/index")
    public String mostrarIndex(){
        return "indexusuario";
    }

    @GetMapping("/clientes")
    public String mostrarCliente(){
        return "registroclientes";
    }


}
