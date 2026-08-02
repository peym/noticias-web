package com.example.noticias.noticias_web.dto;


public record ProyectoLeyResponse(
        String codigoProyecto,
        String titulo,
        String proponente,
        String estadoProcesal,
        String sumilla
) {
}