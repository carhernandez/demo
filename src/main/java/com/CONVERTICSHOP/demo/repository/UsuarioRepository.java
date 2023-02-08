package com.CONVERTICSHOP.demo.repository;

import com.CONVERTICSHOP.demo.modelo.Usuarios;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {


    Optional<Usuarios> findByIdUsuario(int idUsuario);

    Optional <List<Usuarios>> findByIdUsuarioAndContrasena(int idUsuario,String contrasena );

    Optional <List<Usuarios>> findByIdUsuarioOrNombres(int idUsuario,String nombres );


    /*Optional<Usuarios>  findByCorreoElectronicoAndContrasena(String correoElectronico, String contrasena);*/
}
