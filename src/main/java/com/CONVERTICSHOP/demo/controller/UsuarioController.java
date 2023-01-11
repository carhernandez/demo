package com.CONVERTICSHOP.demo.controller;

import com.CONVERTICSHOP.demo.services.UsuariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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





