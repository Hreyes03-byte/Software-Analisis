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
@Table(name="cabezera")
public class cabezera {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_cabezera;
    private String pago;
    private String observacions;


    @Column(name="fecha_registro", columnDefinition ="timestamp")
    private LocalDateTime fecha;

    @Column(unique = true)
    private String guia;

    @ManyToOne
    @JoinColumn(name="cliente_id", nullable=false)
    private Clientes cliente;

    public Integer getId_cabezera(){
        return id_cabezera;
    }

    public void setId_cabezera(Integer id_cabezera){
        this.id_cabezera=id_cabezera;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }


    

}
