package com.CONVERTICSHOP.demo.controller;

import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.services.UsuariosServices;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("")
    public String registro() {


        return "/administrador/LOGIN";
    }

    @DeleteMapping("/delete/{idUsuarios}")
    public ResponseEntity<Map<String, Boolean>> deleteUsuario(@PathVariable Integer idUsuarios) {
        return usuariosServices.deleteUsuario(idUsuarios);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Usuarios>> getAllUsuarios() {
        return usuariosServices.getAllUsuarios();
    }

    @PostMapping(value = "/register", consumes = {"application/x-www-form-urlencoded", "text/plain", "multipart/form-data", "application/json", "text/plain;charset=UTF-8"})
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


    public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Usuarios());
        return mav;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") Usuarios user) {

        ResponseEntity<List<Usuarios>> oauthUser = usuariosServices.getCorreoElectronicoAndPassword(user.getCorreoElectronico(), user.getContrasena());


        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/";

        } else {
            return "redirect:/login";
        }
    }
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request, HttpServletResponse response) {
        return "redirect:/login";

    }
}








