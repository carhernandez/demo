package com.CONVERTICSHOP.demo.repository;

import com.CONVERTICSHOP.demo.modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {




}
