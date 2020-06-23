package br.com.mastertech.validacadastro.services;

import br.com.mastertech.empresa.Empresa;
import br.com.mastertech.validacadastro.producers.ValidaCadastroProducer;
import br.com.mastertech.validacadastro.client.CnpjClient;
import br.com.mastertech.validacadastro.dtos.EmpresaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidaCadastroService {

    @Autowired
    private CnpjClient cnpjClient;

    @Autowired
    private ValidaCadastroProducer validaCadastroProducer;

    public void validaCapital(Empresa empresa) {
        EmpresaDTO empresaDTO = cnpjClient.getByCnpj(empresa.getCnpj());

        if (Double.parseDouble(empresaDTO.getCapitalSocial()) > 1000000.00) {
            validaCadastroProducer.sendToKafka(empresaDTO);
        }
    }
}
