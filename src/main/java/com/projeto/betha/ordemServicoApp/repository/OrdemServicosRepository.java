package com.projeto.betha.ordemServicoApp.repository;

import com.projeto.betha.ordemServicoApp.model.OrdemServicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicosRepository extends JpaRepository<OrdemServicos, Long> {

}
