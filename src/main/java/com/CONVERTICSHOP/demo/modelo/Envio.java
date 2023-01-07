package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "envio")
public class Envio {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Integer idEnvio;

    private LocalDate fecha;

    private Integer idFactura;

    private String direccion;

    private String telefono;

    public Envio() {
    }

    public Envio(LocalDate fecha, Integer idFactura, String direccion, String telefono) {
        this.fecha = fecha;
        this.idFactura = idFactura;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "idEnvio=" + idEnvio +
                ", fecha=" + fecha +
                ", idFactura=" + idFactura +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
