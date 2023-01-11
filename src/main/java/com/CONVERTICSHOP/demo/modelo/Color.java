package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_color")
    private Long idColor;
    private String color;

    @OneToMany(mappedBy = "idColor", fetch = FetchType.LAZY)
    private List<Productos> productos;




}
