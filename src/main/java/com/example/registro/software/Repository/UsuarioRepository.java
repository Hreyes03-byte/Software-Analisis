package com.example.registro.software.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registro.software.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>  {
    Optional<Usuario> findByCorreoAndContrasenia(String correo, String contrasenia);
}

