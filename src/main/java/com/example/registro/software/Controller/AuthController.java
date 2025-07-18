package com.example.registro.software.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registro.software.Repository.UsuarioRepository;
import com.example.registro.software.entities.Usuario;

@RestController
@RequestMapping("/usuarios")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    /**
     * Endpoint de login que busca un usuario por correo y contraseña.
     * Ruta: POST /usuarios/login/check
     * Body (JSON): { "correo": "...", "contrasenia": "..." }
     */
    @PostMapping("/login/check")
    public Usuario login(@RequestBody Usuario loginRequest) {
        Optional<Usuario> usuario = usuarioRepository.findByCorreoAndContrasenia(
                loginRequest.getCorreo(),
                loginRequest.getContrasenia()
        );
        return usuario.orElse(null); // Si no encuentra, devuelve null (puedes manejar mejor esto luego)
    }

    /**
     * Devuelve un usuario por su ID
     * Ruta: GET /usuarios/id/{id}
     */
    @GetMapping("/id/{id}")
    public Usuario obtenerPorId(@PathVariable Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

}



