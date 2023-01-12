package com.CONVERTICSHOP.demo.services;

import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServices {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuarios crearUsuario() {

       Usuarios usuarios = new Usuarios();
        usuarios.setIdUsuario(1234);
        usuarios.setCorreoElectronico("12345@gmail.com");
        //usuarios.setTipoDocumento();
        usuarios.setnDocumento(12345);
        usuarios.setNombres("carlos");
        usuarios.setApellidos("hernandez");
        usuarios.setContrasena("1234567");

        usuarioRepository.save(usuarios);
        return usuarios;
    }

    public List<Usuarios> getUsuario() {
        return usuarioRepository.findAll();
    }

    public void delete(Usuarios usuario) {
        usuarioRepository.delete(usuario);
    }

    public Optional<Usuarios> findById(Integer idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }
}

        /*String correoElectronico;
        Integer tipoDocumento;
        Integer nDocumento;
        String nombres;
        String apellidos;
        String contrasena;*/






