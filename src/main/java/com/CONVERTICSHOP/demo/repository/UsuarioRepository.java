package com.CONVERTICSHOP.demo.repository;

import com.CONVERTICSHOP.demo.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


    Optional<Usuario> findByIdUsuario(int idUsuario);

    Optional <List<Usuario>> findByIdUsuarioAndContrasena(int idUsuario, String contrasena );

    Optional <List<Usuario>> findByIdUsuarioOrNombres(int idUsuario, String nombres );

    Usuario delete(Integer idUsuario);


    /*Optional<Usuario>  findByCorreoElectronicoAndContrasena(String correoElectronico, String contrasena);*/
}
