package com.upiiz.Practica1.Models;

public class Producto {
    private Long id;
    private String nombre;
    private Double precio;
    private Integer cantidad;
    private String recomendacion;
    private String imagen;
    private String categoria;
    private Boolean visible;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con todas las variables
    public Producto(Long id, String nombre, Double precio, Integer cantidad, String recomendacion, String imagen, String categoria, Boolean visible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.recomendacion = recomendacion;
        this.imagen = imagen;
        this.categoria = categoria;
        this.visible = visible;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
