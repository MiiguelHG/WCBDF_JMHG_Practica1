package com.upiiz.Practica1.Models;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Document(collection = "mensajes")
public class Mensaje {
    @Id
    private String id;
    private LocalDateTime fecha;
    private LocalTime hora;
    private String contenido;

    // Constructor vacío
    public Mensaje() {
    }

    // Constructor con todas las variables
    public Mensaje(String id, LocalDateTime fecha, LocalTime hora, String contenido) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.contenido = contenido;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
