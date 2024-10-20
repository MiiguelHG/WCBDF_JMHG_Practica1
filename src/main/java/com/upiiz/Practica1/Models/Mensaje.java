package com.upiiz.Practica1.Models;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Mensaje {
    private Long id;
    private LocalDateTime fecha;
    private LocalTime hora;
    private String contenido;

    // Constructor vacío
    public Mensaje() {
    }

    // Constructor con todas las variables
    public Mensaje(Long id, LocalDateTime fecha, LocalTime hora, String contenido) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.contenido = contenido;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
