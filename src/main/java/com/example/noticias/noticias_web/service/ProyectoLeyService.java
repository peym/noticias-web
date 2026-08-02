package com.example.noticias.noticias_web.service;

import com.example.noticias.noticias_web.dto.ProyectoLeyResponse;
import com.example.noticias.noticias_web.entity.ProyectoLey;
import com.example.noticias.noticias_web.repository.ProyectoLeyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProyectoLeyService {

    private final ProyectoLeyRepository repository;

    public Page<ProyectoLeyResponse> buscar(
            Long idTopico,
            String tipoIniciativa,
            Long anio,
            Pageable pageable) {

        return repository
                .buscar(idTopico, tipoIniciativa, anio, pageable)
                .map(this::convertir);
    }

    private ProyectoLeyResponse convertir(ProyectoLey proyecto) {
        return new ProyectoLeyResponse(
                proyecto.getCodigoProyecto(),
                proyecto.getTitulo(),
                proyecto.getProponente(),
                proyecto.getEstadoProcesal(),
                proyecto.getSumilla()
        );
    }
}