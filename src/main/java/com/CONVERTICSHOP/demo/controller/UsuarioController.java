package com.CONVERTICSHOP.demo.controller;

import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.services.UsuariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("")
    public String registro() {
        

        return "registro";
    }

    @DeleteMapping("/delete/{idUsuarios}")
    public ResponseEntity<Map<String, Boolean>> deleteUsuario(@PathVariable Integer idUsuarios) {
        return usuariosServices.deleteUsuario(idUsuarios);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Usuarios>> getAllUsuarios() {
        return usuariosServices.getAllUsuarios();
    }

    @PostMapping("/register")
    public ResponseEntity<Usuarios> createUsuarios(@RequestBody Usuarios usuarios) {
        return usuariosServices.createUsuarios(usuarios);
    }

    @GetMapping("/{idUsuarios}")
    public ResponseEntity<Usuarios> getUsuariosById(@PathVariable Integer idUsuarios) {
        return usuariosServices.getUsuariosById(idUsuarios);
    }

    @PutMapping("/{idUsuarios}")
    public ResponseEntity<Usuarios> updateUsuarios(@PathVariable Integer idUsuarios, @RequestBody Usuarios usuarios) {
        return usuariosServices.updateUsuarios(idUsuarios, usuarios);
    }

    @GetMapping("/" +
            "")
    public ResponseEntity<List<Usuarios>> getUsuarioAndPassword(@RequestParam int idUsuarios,
                                                                @RequestParam String contrasena) {
        return usuariosServices.getIdUsuarioAndPassword(idUsuarios, contrasena);

    }

    @DeleteMapping("/searchidNom")
    public ResponseEntity<List<Usuarios>> getUsuarioOrNombres(@RequestParam String idUsuarios,
                                                              @RequestParam String nombres) {
        return usuariosServices.getUsuarioOrNombres(Integer.parseInt(idUsuarios), nombres);

    }

    @Autowired
    private UsuariosServices usuariosServices;


}








