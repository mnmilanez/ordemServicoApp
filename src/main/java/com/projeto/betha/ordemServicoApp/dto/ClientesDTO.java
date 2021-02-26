package com.projeto.betha.ordemServicoApp.dto;

import com.projeto.betha.ordemServicoApp.model.Clientes;
import com.projeto.betha.ordemServicoApp.model.OrdemServicos;
import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class ClientesDTO {
    private Long id;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Clientes transformaEmObjetos() {
        return new Clientes(id, nome, endereco, email, telefone);
    }

    public static ClientesDTO transformaEmDTO(Clientes clientes) {
        return new ClientesDTO(clientes.getId(),clientes.getNome(), clientes.getEmail(), clientes.getTelefone(), clientes.getEndereco());
    }
}
