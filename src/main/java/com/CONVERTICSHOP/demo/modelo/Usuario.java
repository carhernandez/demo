package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    String idUsuario;
@Column(name = "correo_electronico", nullable = false)
    String correoElectronico;
@Column(name = "n_documento", nullable = false)
    Integer nDocumento;
@Column(name = "nombres",nullable = false )
    String nombres;
@Column(name = "apellidos",nullable = false)
    String apellidos;
@Column(name = "contrasena")
    String contrasena;

    public Usuario() {
    }

    public Usuario(String correoElectronico, Integer nDocumento, String nombres, String apellidos, String contrasena) {
        this.correoElectronico = correoElectronico;
        this.nDocumento = nDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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


    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nDocumento=" + nDocumento +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
