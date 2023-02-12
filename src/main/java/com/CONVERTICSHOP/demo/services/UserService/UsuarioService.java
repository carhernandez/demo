package com.CONVERTICSHOP.demo.services.UserService;

import com.CONVERTICSHOP.demo.modelo.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService  {

    List<Usuario> obtenerTodos() throws Exception;

    Usuario crearUsuario(Usuario usuario) throws Exception;

    Usuario actualizarUsuario(Integer idUsuario);


    String borrarUsuario (Integer IdUsuario) throws Exception;

    Usuario obtenerUsuarioPorId(int idUsuario);

   Boolean Login (String correoElectronico, String contrasena) throws Exception;


}
