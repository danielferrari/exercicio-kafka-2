package br.com.mastertech.validacadastro.client;

import br.com.mastertech.validacadastro.dtos.EmpresaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cnpj", url = "https://www.receitaws.com.br/v1/cnpj")
public interface CnpjClient {
    @GetMapping("/{cnpj}")
    EmpresaDTO getByCnpj(@PathVariable Long cnpj);
}
