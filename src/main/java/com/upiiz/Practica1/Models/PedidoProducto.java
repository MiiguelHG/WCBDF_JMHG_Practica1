package com.upiiz.Practica1.Models;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document(collection = "pedidosProductos")
public class PedidoProducto {
    @Id
    private String id;
    @Field(targetType = FieldType.OBJECT_ID)
    private String pedidoId;
    @Field(targetType = FieldType.OBJECT_ID)
    private String productoId;
    private Integer cantidad;
    private Double precio;

    // Constructor vacío
    public PedidoProducto() {
    }

    // Constructor con todas las variables
    public PedidoProducto(String id, String pedidoId, String productoId, Integer cantidad, Double precio) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
