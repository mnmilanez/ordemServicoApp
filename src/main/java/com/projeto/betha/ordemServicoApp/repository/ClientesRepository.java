package com.projeto.betha.ordemServicoApp.repository;

import com.projeto.betha.ordemServicoApp.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
