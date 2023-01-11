package com.CONVERTICSHOP.demo.services;

import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServices {

    @Autowired
    private UsuarioRepository usuarioRepository;
    public void crearUsuario (){

        /*Usuarios usuarios = new Usuarios();
        usuarios.setIdUsuario(1234l);
        usuarios.setCorreoElectronico("12345@gmail.com");
        usuarios.setnDocumento(12345);
        usuarios.setNombres("carlos");
        usuarios.setApellidos("hernandez");
        usuarios.setContrasena("1234567");


        usuarioRepository.save(usuarios);*/

        /*String correoElectronico;

        Integer tipoDocumento;

        Integer nDocumento;

        String nombres;

        String apellidos;

        String contrasena;*/


    }



}
