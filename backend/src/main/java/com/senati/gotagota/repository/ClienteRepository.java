package com.senati.gotagota.repository;

import com.senati.gotagota.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
   //No necesitamos escribir nada aqui
    // JpaRepository ya tiene todo_lo_basico
}
