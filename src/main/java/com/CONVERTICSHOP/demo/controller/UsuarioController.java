package com.CONVERTICSHOP.demo.controller;

import com.CONVERTICSHOP.demo.modelo.Usuario;
import com.CONVERTICSHOP.demo.services.UserService.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuariosServices;


    @GetMapping("")
    public String registro() {


        return "/administrador/LOGIN";
    }

    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> getAllUsuarios() throws Exception {
        return ResponseEntity.ok(usuariosServices.obtenerTodos());
    }

    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> createUsuarios(@RequestBody Usuario usuario) throws Exception {
        return new ResponseEntity<>(usuariosServices.crearUsuario(usuario), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idUsuarios}")
    public ResponseEntity<String>  borrarUsuario(@PathVariable Integer idUsuarios) {
        return ResponseEntity.ok(usuariosServices.borrarUsuario(idUsuarios));
    }

    /*@GetMapping("/{idUsuarios}")
    public ResponseEntity<Usuario> getUsuariosById(@PathVariable Integer idUsuarios) {
        return usuariosServices.getUsuariosById(idUsuarios);
    }

    @PutMapping("/{idUsuarios}")
    public ResponseEntity<Usuario> updateUsuarios(@PathVariable Integer idUsuarios, @RequestBody Usuario usuarios) {
        return usuariosServices.updateUsuarios(idUsuarios, usuarios);
    }

    @GetMapping("/" +
            "")
    public ResponseEntity<List<Usuario>> getUsuarioAndPassword(@RequestParam int idUsuarios,
                                                                @RequestParam String contrasena) {
        return usuariosServices.getIdUsuarioAndPassword(idUsuarios, contrasena);

    }

    @DeleteMapping("/searchidNom")
    public ResponseEntity<List<Usuario>> getUsuarioOrNombres(@RequestParam String idUsuarios,
                                                              @RequestParam String nombres) {
        return usuariosServices.getUsuarioOrNombres(Integer.parseInt(idUsuarios), nombres);

    }



    /*public ModelAndView login() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Usuario());
        return mav;
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") Usuario user) {

        ResponseEntity<List<Usuario>> oauthUser = usuariosServices.getCorreoElectronicoAndContrasena
        (user.getCorreoElectronico(), user.getContrasena());

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

    }*/
}








