package com.example.registro.software.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "muestra")
public class muestra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_muestra;
    
    @OneToOne
    @JoinColumn(name="cabezera_id", referencedColumnName = "id_cabezera")
    private cabezera cabezera_id;

    private String codigo_muestra;

    private String descripcion;

    private String tipo_muestra;

    private String origen;

    private LocalDateTime fecha_recepcion;

    private Float peso;

    private String estado_muestra;

    public Integer getId_muestra() {
        return id_muestra;
    }

    public void setId_muestra(Integer id_muestra) {
        this.id_muestra = id_muestra;
    }

    public cabezera getCabezera_id() {
        return cabezera_id;
    }

    public void setCabezera_id(cabezera cabezera_id) {
        this.cabezera_id = cabezera_id;
    }

    public String getCodigo_muestra() {
        return codigo_muestra;
    }

    public void setCodigo_muestra(String codigo_muestra) {
        this.codigo_muestra = codigo_muestra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_muestra() {
        return tipo_muestra;
    }

    public void setTipo_muestra(String tipo_muestra) {
        this.tipo_muestra = tipo_muestra;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDateTime getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(LocalDateTime fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public Float isPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getEstado_muestra() {
        return estado_muestra;
    }

    public void setEstado_muestra(String estado_muestra) {
        this.estado_muestra = estado_muestra;
    }

    


}
