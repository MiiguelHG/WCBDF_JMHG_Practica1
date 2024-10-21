package com.upiiz.Practica1.Models;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document(collection = "usuariosMensajes")
public class UsuarioMensaje {
    @Id
    private String id;
    @Field(targetType = FieldType.OBJECT_ID)
    private String usuarioId;
    @Field(targetType = FieldType.OBJECT_ID)
    private String mensajeId;

    // Constructor vacío
    public UsuarioMensaje() {
    }

    // Constructor con todas las variables
    public UsuarioMensaje(String id, String usuarioId, String mensajeId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.mensajeId = mensajeId;
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

    public String getMensajeId() {
        return mensajeId;
    }

    public void setMensajeId(String mensajeId) {
        this.mensajeId = mensajeId;
    }
}
