package com.projeto.betha.ordemServicoApp.controllers;

import com.projeto.betha.ordemServicoApp.dto.PessoaDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public PessoaDTO index(@RequestBody PessoaDTO pessoa){
        System.out.println(pessoa.getNome());
        return pessoa;
    }
}
