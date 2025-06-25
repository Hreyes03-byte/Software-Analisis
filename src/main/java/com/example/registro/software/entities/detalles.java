package com.example.registro.software.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="detalle")
public class detalles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_detalle;
    
    @OneToOne
    @JoinColumn(name = "muestra_id", referencedColumnName = "id_muestra")
    private muestra muestra_id;

    private String metodo_analisis;

    private String elemento;

    public Integer getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(Integer id_detalle) {
        this.id_detalle = id_detalle;
    }

    public muestra getMuestra_id() {
        return muestra_id;
    }

    public void setMuestra_id(muestra muestra_id) {
        this.muestra_id = muestra_id;
    }

    public String getMetodo_analisis() {
        return metodo_analisis;
    }

    public void setMetodo_analisis(String metodo_analisis) {
        this.metodo_analisis = metodo_analisis;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    
}
