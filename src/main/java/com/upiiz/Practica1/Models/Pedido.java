package com.upiiz.Practica1.Models;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "pedidos")
public class Pedido {
    @Id
    private String id;
    private LocalDateTime fecha;
    private Double cantidadAPagar;
    private Double propina;
    private Double total;
    private Boolean pagado;
    private String preferencias;
    private String ubicacion;
    private String folio;
    private String estado;

    // Constructor vacío
    public Pedido() {
    }

    // Constructor con todas las variables
    public Pedido(String id, LocalDateTime fecha, Double cantidadAPagar, Double propina, Double total, Boolean pagado, String preferencias, String ubicacion, String folio, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.cantidadAPagar = cantidadAPagar;
        this.propina = propina;
        this.total = total;
        this.pagado = pagado;
        this.preferencias = preferencias;
        this.ubicacion = ubicacion;
        this.folio = folio;
        this.estado = estado;
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

    public Double getCantidadAPagar() {
        return cantidadAPagar;
    }

    public void setCantidadAPagar(Double cantidadAPagar) {
        this.cantidadAPagar = cantidadAPagar;
    }

    public Double getPropina() {
        return propina;
    }

    public void setPropina(Double propina) {
        this.propina = propina;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
