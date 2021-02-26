package com.projeto.betha.ordemServicoApp.services;

import com.projeto.betha.ordemServicoApp.dto.ClientesDTO;
import com.projeto.betha.ordemServicoApp.model.Clientes;
import com.projeto.betha.ordemServicoApp.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public List<Clientes> list() {
        return clientesRepository.findAll();
    }

    public Clientes salvar(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    public Clientes atualizar(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    public void excluir(Long id) {
         clientesRepository.deleteById(id);
    }

}
