package com.projeto.betha.ordemServicoApp.controllers;

import com.projeto.betha.ordemServicoApp.dto.OrdemServicosDTO;
import com.projeto.betha.ordemServicoApp.model.OrdemServicos;
import com.projeto.betha.ordemServicoApp.services.OrdemServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/ordem-servicos")
@RestController
public class OrdemServicosController {

    @Autowired
    private OrdemServicosService ordemServicosService;

    @GetMapping
    public List<OrdemServicos> getOrdemServicos(){
        List<OrdemServicos> ordemServicos = ordemServicosService.list();
        return ordemServicos;
    }

    @PostMapping
    public ResponseEntity<OrdemServicosDTO> salvar(@RequestBody OrdemServicosDTO dto){
        OrdemServicos ordemServicos = ordemServicosService.salvar(dto.transformaEmObjetos());
        return new ResponseEntity<>(OrdemServicosDTO.transformaEmDTO(ordemServicos), HttpStatus.CREATED);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<OrdemServicosDTO> update(@PathVariable("id") Long id, @RequestBody OrdemServicosDTO dto){
        dto.setId(id);
        OrdemServicos ordemServicos = ordemServicosService.atualizar(dto.transformaEmObjetos());
        return new ResponseEntity<>(OrdemServicosDTO.transformaEmDTO(ordemServicos), HttpStatus.OK);
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity delete(@PathVariable Long id) {
        ordemServicosService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
