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

    public Color() {
    }

    public Color(String color, List<Productos> productos) {
        this.color = color;
        this.productos = productos;
    }

    public Long getIdColor() {
        return idColor;
    }

    public void setIdColor(Long idColor) {
        this.idColor = idColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Color{" +
                "idColor=" + idColor +
                ", color='" + color + '\'' +
                ", productos=" + productos +
                '}';
    }
}
