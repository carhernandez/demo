package com.CONVERTICSHOP.demo.repository;

import com.CONVERTICSHOP.demo.modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {


    Optional<Object> findByIdProducto(Integer idProducto);


}
