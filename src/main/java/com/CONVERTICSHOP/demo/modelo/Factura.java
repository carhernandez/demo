package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFactura;

    @Column(name = "fecha")
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    Producto producto;
    @Column(name = "cantidad_total")
    private Integer cantidadTotal;
    @Column(name = "iva")
    private Float iva;
    @Column(name = "total")
    private Float total;

    public Factura() {
    }

    public Factura(LocalDate fecha, Usuario usuario, Producto producto, Integer cantidadTotal, Float iva, Float total) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.producto = producto;
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

    public Usuario getUsuarios() {
        return usuario;
    }

    public void setUsuarios(Usuario usuario) {
        this.usuario = usuario;
    }

    public Producto getProductos() {
        return producto;
    }

    public void setProductos(Producto producto) {
        this.producto = producto;
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
                ", usuario=" + usuario +
                ", producto=" + producto +
                ", cantidadTotal=" + cantidadTotal +
                ", iva=" + iva +
                ", total=" + total +
                '}';
    }
}

