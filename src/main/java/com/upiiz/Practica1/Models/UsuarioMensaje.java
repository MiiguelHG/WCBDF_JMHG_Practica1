package com.upiiz.Practica1.Models;

public class UsuarioMensaje {
    private Long id;
    private Long usuarioId;
    private Long mensajeId;

    // Constructor vacío
    public UsuarioMensaje() {
    }

    // Constructor con todas las variables
    public UsuarioMensaje(Long id, Long usuarioId, Long mensajeId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.mensajeId = mensajeId;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getMensajeId() {
        return mensajeId;
    }

    public void setMensajeId(Long mensajeId) {
        this.mensajeId = mensajeId;
    }
}
