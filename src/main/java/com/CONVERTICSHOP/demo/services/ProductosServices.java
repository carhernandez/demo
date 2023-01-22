package com.CONVERTICSHOP.demo.services;

import com.CONVERTICSHOP.demo.modelo.Productos;
import com.CONVERTICSHOP.demo.modelo.Usuarios;
import com.CONVERTICSHOP.demo.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductosServices {
    @Autowired
    private ProductosRepository productosRepository;

    //obtener todos los usuarios
    public ResponseEntity<List<Productos>> getAllProductos() {
        return new ResponseEntity<>(productosRepository.findAll(), HttpStatus.OK);
    }

    // crear usuario rest api

    public ResponseEntity <Productos> createProducto(Productos productos) {
        return new ResponseEntity<>(productosRepository.save(productos),HttpStatus.OK) ;
    }


    // obtener usuario por id rest api
    public ResponseEntity<Productos> getProductosById(Integer idProducto) {
        Productos productos = (Productos) productosRepository.findByIdProducto(idProducto)
                .orElseThrow(() -> new ResourceNotFoundException("Producto no existe con esa id :" +
                        idProducto));
        return ResponseEntity.ok(productos);
    }

    // actualizar usuarios rest api
    public ResponseEntity<Productos> updateProductos(int idProducto, Productos productos) {
        Productos productos1 = (Productos) productosRepository.findByIdProducto(idProducto)
                .orElseThrow(() -> new ResourceNotFoundException("Producto no existe con esa id :" + idProducto));


        productos.setIdProducto(productos1.getIdProducto());
        productos.setDescripcion(productos1.getDescripcion());
        productos.setIdGenero(productos1.getIdGenero());
        productos.setMarca(productos1.getMarca());
        productos.setIdColor(productos1.getIdColor());
        productos.setIdTalla(productos1.getIdTalla());
        productos.setCantidad(productos1.getCantidad());
        productos.setValor(productos1.getValor());



        Productos updateProductos = productosRepository.save(productos);
        return ResponseEntity.ok(updateProductos);
    }

    // borrar usuario rest api
    public ResponseEntity<Map<String, Boolean>> deleteProductos(int idProductos) {
        Productos productos = (Productos) productosRepository.findByIdProducto(idProductos)
                .orElseThrow(() -> new ResourceNotFoundException("Producto no existe con esa id :" + idProductos));

        productosRepository.delete(productos);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    /*public ResponseEntity <List<Productos>> getIdProductoAndDescripcion(int idProductos , String descripcion) {
        List<Productos> productos = (List<Productos>) productosRepository.findByIdProductosAndDescripcion(idProductos, descripcion)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" +
                        idProductos));
        return ResponseEntity.ok(productos);
    }

    public ResponseEntity <List<Productos>> getIdProdcutoAndDescripcion(int idProductos , String descripcion) {
        List<Productos> productos = (List<Productos>) productosRepository.findByIdProductosAndDescripcion(idProductos, descripcion)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" +
                        idProductos));
        return ResponseEntity.ok(productos);
    }

    /*public ResponseEntity <List<Usuarios>> getUsuarioOrNombres(int idUsuarios , String nombres) {
        List<Usuarios> usuarios = productosRepository.findByIdUsuarioOrNombres(idUsuarios, nombres)
                .orElseThrow(() -> new ResourceNotFoundException("Usuarios no existe con esa id :" +
                        idUsuarios));
        return ResponseEntity.ok(usuarios);
    }*/


}
