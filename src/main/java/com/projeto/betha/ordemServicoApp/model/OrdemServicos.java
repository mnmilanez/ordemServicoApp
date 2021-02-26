package com.projeto.betha.ordemServicoApp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor // JPA Only
public class OrdemServicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private Long cliente_id;
    private String tipo_equipamento;
    private String marca;
    private String  descricao;
    private String status;
    private Date data;
    private Date data_resolucao;

    @OneToOne(fetch=FetchType.LAZY, mappedBy="ordemServicos")
    private Clientes clientes;

    public OrdemServicos(/*Long cliente_id,*/ String tipo_equipamento, String marca, String descricao, String status, Date data, Date data_resolucao){
//        this.cliente_id = cliente_id;
        this.tipo_equipamento = tipo_equipamento;
        this.marca = marca;
        this.descricao = descricao;
        this.status = status;
        this.data = data;
        this.data_resolucao = data_resolucao;

    }
}
