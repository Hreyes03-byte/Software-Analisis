package com.example.registro.software.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



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
        return "clientes";
    }

    @GetMapping("/registroCliente")
    public String mostrarRegistroCliente(){
        return "registrocliente";
    }

    @GetMapping("/empresa")
    public String mostarEmpresa() {
        return "empresa";
    }
    
    @GetMapping("/reporte")
    public String mostrarReporte(){
        return "reporte";
    }

    @GetMapping("/registroEmpresa")
    public String mostrarRegistroEmpresa(){
        return "registroEmpresa";
    }

}
