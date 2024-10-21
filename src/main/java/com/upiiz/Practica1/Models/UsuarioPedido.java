package com.upiiz.Practica1.Models;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document(collection = "usuariosPedidos")
public class UsuarioPedido {
    @Id
    private String id;
    @Field(targetType = FieldType.OBJECT_ID)
    private String usuarioId;
    @Field(targetType = FieldType.OBJECT_ID)
    private String pedidoId;

    // Constructor vacío
    public UsuarioPedido() {
    }

    // Constructor con todas las variables
    public UsuarioPedido(String id, String usuarioId, String pedidoId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.pedidoId = pedidoId;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }
}
