package com.CONVERTICSHOP.demo.controller;

import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.services.UsuariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("")
    public String registro() {
        usuariosServices.crearUsuario();

        return "registro";
    }


    @Autowired
    private UsuariosServices usuariosServices;


}








