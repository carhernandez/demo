package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column (name = "correo_electronico")
    private String correoElectronico;

    @ManyToOne
    @JoinColumn(name = "tipo_documento")
    TipoDocumento tipoDocumento;
    @Column (name = "n_documento")
    private Integer nDocumento;
    @Column(name = "nombres")
    private String nombres;
    @Column (name = "apellidos")
    private String apellidos;
    @Column (name = "contrasena")
    private String contrasena;
    @OneToMany (mappedBy ="usuarios")
    private List<Productos> productos;

    public Usuarios() {
    }

    public Usuarios(String correoElectronico, TipoDocumento tipoDocumento, Integer nDocumento,
                    String nombres, String apellidos, String contrasena, List<Productos> productos) {
        this.correoElectronico = correoElectronico;
        this.tipoDocumento = tipoDocumento;
        this.nDocumento = nDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.productos = productos;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getnDocumento() {
        return nDocumento;
    }

    public void setnDocumento(Integer nDocumento) {
        this.nDocumento = nDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
}
