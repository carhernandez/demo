package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table (name = "producto")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String idProducto;
    @Column(name = "descripcion", nullable = false)
    String descripcion;
    @Column(name = "marca", nullable = false)
    Integer marca;
    @Column(name = "id_color",nullable = false )
    String idColor;
    @Column(name = "id_genero",nullable = false )
    String idGenero;
    @Column(name = "id_talla",nullable = false)
    String idTalla;
    @Column(name = "valor")
    String valor;
    @Column(name = "cantidad")
    String cantidad;
    @ManyToOne
    private Usuarios usuarios;

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }


}
