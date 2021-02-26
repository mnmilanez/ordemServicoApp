package com.projeto.betha.ordemServicoApp.dto;

public class TelefoneDTO {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "TelefoneDTO{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
