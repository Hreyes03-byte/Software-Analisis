package com.example.registro.software.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registro.software.entities.Clientes;

public interface clienteRepository extends JpaRepository<Clientes, Integer> {

}
