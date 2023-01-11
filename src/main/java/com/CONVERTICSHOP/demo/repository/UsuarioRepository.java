package com.CONVERTICSHOP.demo.repository;

import com.CONVERTICSHOP.demo.modelo.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {








}
