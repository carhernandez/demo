package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "talla")
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTalla;

    @Column (name = "talla")
    private String talla;

    @OneToMany(mappedBy = "idTalla", fetch = FetchType.LAZY)
    private List<Producto> productos;

    public Talla() {
    }

    public Talla(String talla) {
        this.talla = talla;
    }

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Talla{" +
                "idTalla=" + idTalla +
                ", talla='" + talla + '\'' +
                '}';
    }
}
