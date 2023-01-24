package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String descripcion;
    private String marca;
    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color idColor;
    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero idGenero;
    @ManyToOne
    @JoinColumn(name = "id_talla")
    private Talla idTalla;
    private Integer valor;
    private Integer cantidad;
    /*@ManyToOne
    @JoinColumn(name = "usuario_id_usuario")
    private Usuarios usuarios;*/

    public Productos() {
    }

    public Productos(String descripcion, String marca, Color idColor, Genero idGenero, Talla idTalla,
                     Integer valor, Integer cantidad, Usuarios usuarios) {
        this.descripcion = descripcion;
        this.marca = marca;
        this.idColor = idColor;
        this.idGenero = idGenero;
        this.idTalla = idTalla;
        this.valor = valor;
        this.cantidad = cantidad;
        //this.usuarios = usuarios;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getIdColor() {
        return idColor;
    }

    public void setIdColor(Color idColor) {
        this.idColor = idColor;
    }

    public Genero getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Genero idGenero) {
        this.idGenero = idGenero;
    }

    public Talla getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Talla idTalla) {
        this.idTalla = idTalla;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /*public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }*/
}




