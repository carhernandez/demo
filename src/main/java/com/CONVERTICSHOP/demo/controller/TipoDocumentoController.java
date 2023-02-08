package com.CONVERTICSHOP.demo.controller;

import com.CONVERTICSHOP.demo.modelo.TipoDocumento;
import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.services.TipoDocumentoServices;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/tipodocumento")
public class TipoDocumentoController {

    @GetMapping("/all")
    public ResponseEntity<List<TipoDocumento>> getAlltipoDocumento() {
        return TipoDocumentoServices.getAlltipoDocumento();
    }



}
