package com.CONVERTICSHOP.demo.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer idTipoDocumento;
    @Column (name = "documento")
    private String documento;
    @OneToMany (mappedBy = "tipoDocumento", fetch = FetchType.LAZY)
    private List<Usuarios> usuarios;

    public TipoDocumento() {
    }

    public TipoDocumento(String documento, List<Usuarios> usuarios) {
        this.documento = documento;
        this.usuarios = usuarios;
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

    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }


}
