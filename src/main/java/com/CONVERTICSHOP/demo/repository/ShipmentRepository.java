package com.CONVERTICSHOP.demo.repository;

import com.CONVERTICSHOP.demo.modelo.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Envio, Integer> {


}
