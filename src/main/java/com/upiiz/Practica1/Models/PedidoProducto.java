package com.upiiz.Practica1.Models;

public class PedidoProducto {
    private Long id;
    private Long pedidoId;
    private Long productoId;
    private Integer cantidad;
    private Double precio;

    // Constructor vacío
    public PedidoProducto() {
    }

    // Constructor con todas las variables
    public PedidoProducto(Long id, Long pedidoId, Long productoId, Integer cantidad, Double precio) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
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
