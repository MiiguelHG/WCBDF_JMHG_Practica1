package com.upiiz.Practica1.Models;

public class UsuarioPedido {
    private Long id;
    private Long usuarioId;
    private Long pedidoId;

    // Constructor vacío
    public UsuarioPedido() {
    }

    // Constructor con todas las variables
    public UsuarioPedido(Long id, Long usuarioId, Long pedidoId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.pedidoId = pedidoId;
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

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }
}
