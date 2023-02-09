package com.CONVERTICSHOP.demo.services;

import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuariosServices {

    @Autowired
    private UsuarioRepository usuarioRepository;


    /*public List<Usuarios> getUsuario() {
        return usuarioRepository.findAll();
    }

    public void delete(Usuarios usuario) {
        usuarioRepository.delete(usuario);
    }

    public Optional<Usuarios> findById(Integer idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }*/

        /*String correoElectronico;
        Integer tipoDocumento;
        Integer nDocumento;
        String nombres;
        String apellidos;
        String contrasena;*/

    Usuarios usuarios = new Usuarios();

    // obtener todos los usuarios
    public ResponseEntity<List<Usuarios>> getAllUsuarios() {
        return new ResponseEntity<>(usuarioRepository.findAll(), HttpStatus.OK);
    }

    // crear usuario rest api

    public ResponseEntity<Usuarios> createUsuarios(Usuarios usuarios) {
        return new ResponseEntity<>(usuarioRepository.save(usuarios), HttpStatus.OK);
    }

    Usuarios usuario = new Usuarios();

    // obtener usuario por id rest api
    public ResponseEntity<Usuarios> getUsuariosById(Integer idUsuarios) {
        Usuarios usuarios = usuarioRepository.findByIdUsuario(idUsuarios)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" +
                        idUsuarios));
        return ResponseEntity.ok(usuarios);
    }

    // actualizar usuarios rest api
    public ResponseEntity<Usuarios> updateUsuarios(int idUsuarios, Usuarios usuarios1) {
        Usuarios usuarios = usuarioRepository.findByIdUsuario(idUsuarios)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" + idUsuarios));


        usuarios.setCorreoElectronico(usuarios1.getCorreoElectronico());
        usuarios.setTipoDocumento(usuarios1.getTipoDocumento());
        usuarios.setnDocumento(usuarios1.getnDocumento());
        usuarios.setNombres(usuarios1.getNombres());
        usuarios.setApellidos(usuarios1.getApellidos());
        usuarios.setContrasena(usuarios1.getContrasena());

        Usuarios updateUsuarios = usuarioRepository.save(usuarios);
        return ResponseEntity.ok(updateUsuarios);
    }

    // borrar usuario rest api
    public ResponseEntity<Map<String, Boolean>> deleteUsuario(int idUsuarios) {
        Usuarios usuarios = usuarioRepository.findByIdUsuario(idUsuarios)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" + idUsuarios));

        usuarioRepository.delete(usuarios);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<List<Usuarios>> getIdUsuarioAndPassword(int idUsuarios, String contrasena) {
        List<Usuarios> usuarios = usuarioRepository.findByIdUsuarioAndContrasena(idUsuarios, contrasena)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" +
                        idUsuarios));
        return ResponseEntity.ok(usuarios);
    }

    public ResponseEntity<List<Usuarios>> getUsuarioOrNombres(int idUsuarios, String nombres) {
        List<Usuarios> usuarios = usuarioRepository.findByIdUsuarioOrNombres(idUsuarios, nombres)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" +
                        idUsuarios));
        return ResponseEntity.ok(usuarios);
    }

    public ResponseEntity<List<Usuarios>> getCorreoElectronicoAndContrasena(String correoElectronico,
                                                                            String contrasena) {
        return null;
    }

   /* public ResponseEntity<List<Usuarios>> getCorreoElectronicoAndContrasena(String correoElectronico, String contrasena) {
        List<Usuarios> usuarios = (List<Usuarios>) usuarioRepository.findByCorreoElectronicoAndContrasena(correoElectronico,
                        contrasena)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con ese  :" +
                        correoElectronico));
        return ResponseEntity.ok(usuarios);
    }*/

}

