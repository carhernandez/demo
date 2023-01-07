package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFactura;

    @Column (name = "fecha")
    private LocalDate fecha;

    private Integer idUsuario;

    private Integer idProducto;

    private Integer cantidadTotal;

    private Float iva;

    private Float total;

    public Factura() {
    }

    public Factura(LocalDate fecha, Integer idUsuario, Integer idProducto, Integer cantidadTotal, Float iva, Float total) {
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.cantidadTotal = cantidadTotal;
        this.iva = iva;
        this.total = total;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(Integer cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura=" + idFactura +
                ", fecha=" + fecha +
                ", idUsuario=" + idUsuario +
                ", idProducto=" + idProducto +
                ", cantidadTotal=" + cantidadTotal +
                ", iva=" + iva +
                ", total=" + total +
                '}';
    }
}
