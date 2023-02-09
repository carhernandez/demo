package com.CONVERTICSHOP.demo.services;

import com.CONVERTICSHOP.demo.modelo.TipoDocumento;
import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TipoDocumentoServices{

    @Autowired
    private static TipoDocumentoRepository tipoDocumentoRepository;


    Usuarios usuarios = new Usuarios();

    // obtener todos los usuarios
    public static ResponseEntity<List<TipoDocumento>> getAlltipoDocumento() {
        return new ResponseEntity(tipoDocumentoRepository.findAll(), HttpStatus.OK);
    }

    // crear tipo de documento rest api
    public ResponseEntity<TipoDocumento> createtipoDocumento(TipoDocumento tipoDocumento) {
        return new ResponseEntity<>(tipoDocumentoRepository.save(tipoDocumento), HttpStatus.OK);
    }


    // obtener tipo de documento por id rest api
    public ResponseEntity<TipoDocumento> gettipoDocumentoById(Integer idtipoDocumento) {
        TipoDocumento tipoDocumento = tipoDocumentoRepository.findById(idtipoDocumento)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" + idtipoDocumento
                        ));
        return ResponseEntity.ok(tipoDocumentoRepository.getReferenceById(idtipoDocumento));
    }
/*
    // actualizar usuarios rest api
    public ResponseEntity<TipoDocumento> updateTipoDocumento(int idTipoDocumento, TipoDocumento tipoDocumento1) {
        TipoDocumento tipoDocumento = TipoDocumentoRepository.findById(idTipoDocumento)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" + idTipoDocumento));

        tipoDocumento1.setIdTipoDocumento(tipoDocumento1.getIdTipoDocumento());


        TipoDocumento updateTipoDocumento = tipoDocumentoRepository.save(tipoDocumento);
        return ResponseEntity.ok(updateTipoDocumento);
    }

    // borrar usuario rest api
    public ResponseEntity<Map<String, Boolean>> deleteTipoDocumento(int idTipoDocumento) {
        TipoDocumento tipoDocumento = TipoDocumentoRepository.fi(idUsuarios)
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
    }*/


}
