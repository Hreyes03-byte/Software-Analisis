package com.example.registro.software.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registro.software.Repository.UsuarioRepository;
import com.example.registro.software.Repository.clienteRepository;
import com.example.registro.software.entities.Clientes;
import com.example.registro.software.entities.Usuario;

@RestController
@RequestMapping("/clientes")
public class clienteController {

    @Autowired
    private clienteRepository clienteRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Registrar nuevo cliente
    @PostMapping("/registrar/{usuarioId}")
    public Clientes registrarCliente(@RequestBody Clientes cliente, @PathVariable Integer usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElse(null);
        if (usuario == null) {
            return null; // o lanzar excepción personalizada
        }

        cliente.setRegistradoPor(usuario);
        return clienteRepository.save(cliente);
    }

    // Obtener todos los clientes
    @GetMapping("/lista")
    public List<Clientes> listarClientes() {
        return clienteRepository.findAll();
    }
}
