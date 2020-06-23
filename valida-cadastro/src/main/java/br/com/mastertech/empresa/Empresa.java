package br.com.mastertech.empresa;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Empresa {
    private Long cnpj;

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
