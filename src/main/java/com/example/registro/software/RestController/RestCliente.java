package com.example.registro.software.RestController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.registro.software.Repository.clienteRepository;
import com.example.registro.software.entities.Clientes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/clientes")
public class RestCliente {
    private final clienteRepository clienteRepo;
    
    public RestCliente ( clienteRepository clienteRepo){
        this.clienteRepo=clienteRepo;
    }

    @GetMapping
    public List<Clientes> listaCliente() {
        return clienteRepo.findAll();
    }
    

}
