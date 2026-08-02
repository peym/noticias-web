package com.example.noticias.noticias_web.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name = "proyecto_ley")
public class ProyectoLey {

    @Id
    @Column(name = "codigo_proyecto")
    private String codigoProyecto;

    @Column(name = "anio_proyecto")
    private Long anioProyecto;

    @Column(name = "proponente")
    private String proponente;

    @Column(name = "tipo_iniciativa")
    private String tipoIniciativa;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "sumilla")
    private String sumilla;

    @Column(name = "estado_normalizado")
    private String estadoProcesal;

    @Column(name = "grupo_parlamentario")
    private String grupoParlamentario;

    @Column(name = "comision_principal")
    private String comisionPrincipal;

    @Column(name = "n_archivos")
    private Long numeroArchivos;

    @Column(name = "pdf_url")
    private String pdfUrl;

    @Column(name = "fecha_presentacion")
    private LocalDate fechaPresentacion;

    @Column(name = "fecha_ultimo_movimiento")
    private LocalDate fechaUltimoMovimiento;

    @Column(name = "id_topico")
    private Long idTopico;

    @Column(name = "topico")
    private String topico;

    @Column(name = "confianza")
    private Double confianza;

    public ProyectoLey() {
    }

    public String getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(String codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public Long getAnioProyecto() {
        return anioProyecto;
    }

    public void setAnioProyecto(Long anioProyecto) {
        this.anioProyecto = anioProyecto;
    }

    public String getProponente() {
        return proponente;
    }

    public void setProponente(String proponente) {
        this.proponente = proponente;
    }

    public String getTipoIniciativa() {
        return tipoIniciativa;
    }

    public void setTipoIniciativa(String tipoIniciativa) {
        this.tipoIniciativa = tipoIniciativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSumilla() {
        return sumilla;
    }

    public void setSumilla(String sumilla) {
        this.sumilla = sumilla;
    }

    public String getEstadoProcesal() {
        return estadoProcesal;
    }

    public void setEstadoProcesal(String estadoProcesal) {
        this.estadoProcesal = estadoProcesal;
    }

    public String getGrupoParlamentario() {
        return grupoParlamentario;
    }

    public void setGrupoParlamentario(String grupoParlamentario) {
        this.grupoParlamentario = grupoParlamentario;
    }

    public String getComisionPrincipal() {
        return comisionPrincipal;
    }

    public void setComisionPrincipal(String comisionPrincipal) {
        this.comisionPrincipal = comisionPrincipal;
    }

    public Long getNumeroArchivos() {
        return numeroArchivos;
    }

    public void setNumeroArchivos(Long numeroArchivos) {
        this.numeroArchivos = numeroArchivos;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public LocalDate getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(LocalDate fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }

    public Long getIdTopico() {
        return idTopico;
    }

    public void setIdTopico(Long idTopico) {
        this.idTopico = idTopico;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public Double getConfianza() {
        return confianza;
    }

    public void setConfianza(Double confianza) {
        this.confianza = confianza;
    }
}