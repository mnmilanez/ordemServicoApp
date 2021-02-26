package com.projeto.betha.ordemServicoApp.services;

import com.projeto.betha.ordemServicoApp.model.OrdemServicos;
import com.projeto.betha.ordemServicoApp.repository.OrdemServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemServicosService {

    @Autowired
    private OrdemServicosRepository ordemServicosRepository;

    public OrdemServicosService(OrdemServicosRepository ordemServicosRepository) {
        this.ordemServicosRepository = ordemServicosRepository;
    }

    public List<OrdemServicos> list(){
        return ordemServicosRepository.findAll();
    }

    public OrdemServicos salvar(OrdemServicos ordemServicos) {
        return ordemServicosRepository.save(ordemServicos);
    }

    public OrdemServicos atualizar(OrdemServicos ordemServicos) {
        return ordemServicosRepository.save(ordemServicos);
    }

    public void excluir(Long id) {
        ordemServicosRepository.deleteById(id);
    }
}
