package com.projeto.betha.ordemServicoApp.dto;

import java.util.ArrayList;
import java.util.List;

public class PessoaDTO {

    private String nome;
    private String idade;

    private List<TelefoneDTO> telefones = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public List<TelefoneDTO> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneDTO> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "PessoaDTO{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", telefones=" + telefones +
                '}';
    }
}
