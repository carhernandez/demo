package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer idTipoDocumento;
    @Column (name = "documento")
    private String documento;
    @OneToMany (mappedBy = "tipoDocumento", fetch = FetchType.LAZY)
    private Set<Usuarios> usuarios;

    public TipoDocumento() {
    }

    public TipoDocumento(String documento, Set<Usuarios> usuarios) {
        this.documento = documento;
        this.usuarios= usuarios;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Set<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }


}
