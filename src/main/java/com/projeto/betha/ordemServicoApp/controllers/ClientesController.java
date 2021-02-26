package com.projeto.betha.ordemServicoApp.controllers;

import com.projeto.betha.ordemServicoApp.dto.ClientesDTO;
import com.projeto.betha.ordemServicoApp.model.Clientes;
import com.projeto.betha.ordemServicoApp.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/clientes")
@RestController
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping
    public List<Clientes> getClientes(){
        List<Clientes> clientes = clientesService.list();
         return clientes;
    }

    @PostMapping
    public ResponseEntity<ClientesDTO> salvar(@RequestBody ClientesDTO dto) {
        Clientes clientes =  clientesService.salvar(dto.transformaEmObjetos());
        return new ResponseEntity<>(ClientesDTO.transformaEmDTO(clientes), HttpStatus.CREATED);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<ClientesDTO> update(@PathVariable("id") Long id, @RequestBody ClientesDTO dto) {
        dto.setId(id);
        Clientes clientes = clientesService.atualizar(dto.transformaEmObjetos());
            return new ResponseEntity<>(ClientesDTO.transformaEmDTO(clientes), HttpStatus.OK);
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity delete(@PathVariable Long id) {
        clientesService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
