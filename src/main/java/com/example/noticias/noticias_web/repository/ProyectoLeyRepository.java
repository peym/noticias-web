package com.example.noticias.noticias_web.repository;

import com.example.noticias.noticias_web.entity.ProyectoLey;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoLeyRepository
        extends JpaRepository<ProyectoLey, String> {

    @Query("""
        SELECT p
        FROM ProyectoLey p
        WHERE (:idTopico IS NULL OR p.idTopico = :idTopico)
          AND (:tipoIniciativa IS NULL
               OR p.tipoIniciativa = :tipoIniciativa)
          AND (:anio IS NULL OR p.anioProyecto = :anio)
        ORDER BY p.anioProyecto DESC, p.codigoProyecto DESC
    """)
    Page<ProyectoLey> buscar(
            @Param("idTopico") Long idTopico,
            @Param("tipoIniciativa") String tipoIniciativa,
            @Param("anio") Long anio,
            Pageable pageable
    );
}