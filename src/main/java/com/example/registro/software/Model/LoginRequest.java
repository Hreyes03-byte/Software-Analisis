package com.example.registro.software.Model;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank(message="El correo es obligatorio")
    private String correo;

    @NotBlank(message="La contrasenia es obligatoria")
    private String contrasenia;

    public String GetCorreo(){
        return correo;
    }

    public void SetCorreo(String correo){
        this.correo=correo;
    }

    public String GetContrasenia(){
        return contrasenia;
    }

    public void SetContrasenia(String contrasenia){
        this.contrasenia=contrasenia;
    }
}
