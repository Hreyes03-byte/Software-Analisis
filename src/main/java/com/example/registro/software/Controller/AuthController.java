package com.example.registro.software.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.registro.software.Model.LoginRequest;
import com.example.registro.software.Model.Usuario;
import com.example.registro.software.Repository.UsuarioRepository;

import jakarta.validation.Valid;





@Controller
public class AuthController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("loginrequest", new LoginRequest());
        return "login";
    }       
    
    @PostMapping("/login")
    public String procesarLogin(@Valid @ModelAttribute("loginEquest") LoginRequest loginRequest, BindingResult result, Model model){
        if(result.hasErrors()){
            return "login";
        }
        Optional<Usuario> usuario=usuarioRepository.findByCorreoAndContrasenia(loginRequest.GetCorreo(), loginRequest.GetContrasenia());

        if(usuario.isPresent()){
            return "redirect:/Bienvenido";
        } else {
            model.addAttribute("error", "contrasenia o correo incorrecto");
            return "login";
        }
    }
}


