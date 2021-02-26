package com.projeto.betha.ordemServicoApp.dto;

import com.projeto.betha.ordemServicoApp.model.OrdemServicos;
import lombok.*;

import java.util.Date;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class OrdemServicosDTO {

    private Long id;
    private String tipo_equipamento;
    private String marca;
    private String descricao;
    private String status;
    private Date data;
    private Date data_resolucao;

    public OrdemServicos transformaEmObjetos() {
        return new OrdemServicos( tipo_equipamento,marca,descricao,status,data,data_resolucao);
    }

    public static OrdemServicosDTO transformaEmDTO(OrdemServicos ordemServicos) {
        return new OrdemServicosDTO(ordemServicos.getId(), ordemServicos.getTipo_equipamento(), ordemServicos.getMarca(), ordemServicos.getDescricao(), ordemServicos.getStatus(), ordemServicos.getData(), ordemServicos.getData_resolucao());
    }
}
