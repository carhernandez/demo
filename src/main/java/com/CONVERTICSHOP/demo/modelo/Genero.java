package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "genero")

public class Genero {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idGenero;


    @Column (name = "genero")
    private String genero;
    @OneToMany(mappedBy = "idGenero")
    private List<Productos> productos;

    public Genero() {
    }

    public Genero(String genero) {
        this.genero = genero;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
