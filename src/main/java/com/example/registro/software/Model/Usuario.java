package com.example.registro.software.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    private int userid;

    private String nombre;

    private int dni;

    @NotBlank
    private String correo;

    @NotBlank
    private String contrasenia;

    public int GetUserid(){
        return userid;
    }

    public void setUserid(int userid){
        this.userid=userid;
    }

    public String GetNombre(){
        return nombre;
    }

    public void SetNombre(String nombre){
        this.nombre=nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String GetContrasenia(){
        return contrasenia;
    }

    public void SetContrasenia(String contrasenia){
        this.contrasenia=contrasenia;
    }

}
