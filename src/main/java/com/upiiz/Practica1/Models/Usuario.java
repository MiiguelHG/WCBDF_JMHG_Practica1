package com.upiiz.Practica1.Models;

public class Usuario {
    private Long id;
    private String rol;
    private String clave;
    private String nombreCompleto;
    private String email;
    private String imagenPerfil;
    private String tokenRestablecimiento;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con todas las variables
    public Usuario(Long id, String rol, String clave, String nombreCompleto, String email, String imagenPerfil, String tokenRestablecimiento) {
        this.id = id;
        this.rol = rol;
        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.imagenPerfil = imagenPerfil;
        this.tokenRestablecimiento = tokenRestablecimiento;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getTokenRestablecimiento() {
        return tokenRestablecimiento;
    }

    public void setTokenRestablecimiento(String tokenRestablecimiento) {
        this.tokenRestablecimiento = tokenRestablecimiento;
    }
}
