package com.example.registro.software.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registro.software.Repository.cabezeraRepository;
import com.example.registro.software.entities.cabezera;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/cabezera")
public class RestCabezera {
    private final cabezeraRepository cabezeraRepo;

    public RestCabezera (cabezeraRepository cabezeraRepo){
        this.cabezeraRepo=cabezeraRepo;
    }

    @GetMapping
    public List<cabezera> listaCabezera() {
        return cabezeraRepo.findAll();
    }
    
}
