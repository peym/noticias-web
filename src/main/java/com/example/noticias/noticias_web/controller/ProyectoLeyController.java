package com.example.noticias.noticias_web.controller;

import com.example.noticias.noticias_web.dto.ProyectoLeyResponse;
import com.example.noticias.noticias_web.service.ProyectoLeyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/proyectos")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoLeyController {

    private final ProyectoLeyService service;

    @GetMapping
    public Page<ProyectoLeyResponse> buscar(
            @RequestParam(required = false) Long idTopico,
            @RequestParam(required = false) String tipoIniciativa,
            @RequestParam(required = false) Long anio,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Pageable pageable = PageRequest.of(page, size);

        return service.buscar(
                idTopico,
                normalizar(tipoIniciativa),
                anio,
                pageable
        );
    }

    private String normalizar(String valor) {
        if (valor == null || valor.isBlank()) {
            return null;
        }

        return valor;
    }
}