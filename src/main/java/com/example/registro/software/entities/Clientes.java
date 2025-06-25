package com.example.registro.software.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_cliente;


    private String nombre;
    private String correo;

    @Column(unique= true)
    private String ruc;

    @Column(unique=true)
    private String telefono;

    @Column(name="fecha_registro", columnDefinition="TIMESTAMP")
    private LocalDateTime fechaRegistro;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId(Integer id_cliente) {
        this.id_cliente= id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
        
    /* @PrePersist
    public void prePersist() {
        if (fechaRegistro == null) {
            fechaRegistro = LocalDateTime.now();
        }
    } */
}
