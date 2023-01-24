package com.CONVERTICSHOP.demo.controller;

import com.CONVERTICSHOP.demo.modelo.Productos;
import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.services.ProductosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/producto")
public class ProductosController {

   @GetMapping("")
    public String registro() {


        return "/administrador/FormularioRegistro";
    }

    @DeleteMapping("/delete/{idProducto}")
    public ResponseEntity<Map<String, Boolean>> deleteProductos(@PathVariable Integer idProducto) {
        return productosServices.deleteProducto(idProducto);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Productos>> getAllProductos() {
        return productosServices.getAllProductos();
    }

    @PostMapping("/register")
    public ResponseEntity<Productos> createProducto(@RequestBody Productos productos) {
        return productosServices.createProducto(productos);
    }

    @GetMapping("/{idProducto}")
    public ResponseEntity<Productos> getProductosById(@PathVariable Integer idProducto) {
        return productosServices.getProductosById(idProducto);
    }

    @PutMapping("/{idProducto}")
    public ResponseEntity<Productos> updateProductos(@PathVariable Integer idProducto, @RequestBody Productos productos) {
        return productosServices.updateProductos(idProducto, productos);
    }
/*
    @GetMapping("/" +
            "")
    public ResponseEntity<List<Usuarios>> getUsuarioAndPassword(@RequestParam int idProducto,
                                                                @RequestParam String contrasena) {
        return usuariosServices.getIdUsuarioAndPassword(idProducto, contrasena);

    }

    @DeleteMapping("/searchidNom")
    public ResponseEntity<List<Usuarios>> getUsuarioOrNombres(@RequestParam String idUsuarios,
                                                              @RequestParam String nombres) {
        return usuariosServices.getUsuarioOrNombres(Integer.parseInt(idUsuarios), nombres);

    }*/

    @Autowired
    private ProductosServices productosServices;

}
