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
    Usuarios usuarios;
    @ManyToOne
    @JoinColumn(name = "id_producto")
    Productos productos;
    @Column(name = "cantidad_total")
    private Integer cantidadTotal;
    @Column(name = "iva")
    private Float iva;
    @Column(name = "total")
    private Float total;

    public Factura() {
    }

    public Factura(LocalDate fecha, Usuarios usuarios, Productos productos, Integer cantidadTotal, Float iva, Float total) {
        this.fecha = fecha;
        this.usuarios = usuarios;
        this.productos = productos;
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

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
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
                ", usuarios=" + usuarios +
                ", productos=" + productos +
                ", cantidadTotal=" + cantidadTotal +
                ", iva=" + iva +
                ", total=" + total +
                '}';
    }
}

