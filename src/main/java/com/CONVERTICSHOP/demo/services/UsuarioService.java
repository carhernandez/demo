package com.CONVERTICSHOP.demo.services;

import com.CONVERTICSHOP.demo.modelo.Usuario;

import java.util.List;

public interface UsuarioService  {

    List<Usuario> obtenerTodos();

    Usuario crearUsuario(Usuario usuario);

    Usuario actualizarUsuario(Integer idUsuario);


    Usuario borrarUsuario (Integer IdUsuario);


}
