package com.CONVERTICSHOP.demo.services;

import com.CONVERTICSHOP.demo.modelo.TipoDocumento;
import com.CONVERTICSHOP.demo.modelo.Usuario;
import com.CONVERTICSHOP.demo.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServices{

    @Autowired
    private static TipoDocumentoRepository tipoDocumentoRepository;


    Usuario usuario = new Usuario();

    // obtener todos los usuario
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
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no existe con esa id :" + idtipoDocumento
                        ));
        return ResponseEntity.ok(tipoDocumentoRepository.getReferenceById(idtipoDocumento));
    }
/*
    // actualizar usuario rest api
    public ResponseEntity<TipoDocumento> updateTipoDocumento(int idTipoDocumento, TipoDocumento tipoDocumento1) {
        TipoDocumento tipoDocumento = TipoDocumentoRepository.findById(idTipoDocumento)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no existe con esa id :" + idTipoDocumento));

        tipoDocumento1.setIdTipoDocumento(tipoDocumento1.getIdTipoDocumento());


        TipoDocumento updateTipoDocumento = tipoDocumentoRepository.save(tipoDocumento);
        return ResponseEntity.ok(updateTipoDocumento);
    }

    // borrar usuario rest api
    public ResponseEntity<Map<String, Boolean>> deleteTipoDocumento(int idTipoDocumento) {
        TipoDocumento tipoDocumento = TipoDocumentoRepository.fi(idUsuarios)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no existe con esa id :" + idUsuarios));

        usuarioRepository.delete(usuario);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<List<Usuario>> getIdUsuarioAndPassword(int idUsuarios, String contrasena) {
        List<Usuario> usuario = usuarioRepository.findByIdUsuarioAndContrasena(idUsuarios, contrasena)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no existe con esa id :" +
                        idUsuarios));
        return ResponseEntity.ok(usuario);
    }

    public ResponseEntity<List<Usuario>> getUsuarioOrNombres(int idUsuarios, String nombres) {
        List<Usuario> usuario = usuarioRepository.findByIdUsuarioOrNombres(idUsuarios, nombres)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no existe con esa id :" +
                        idUsuarios));
        return ResponseEntity.ok(usuario);
    }*/


}
