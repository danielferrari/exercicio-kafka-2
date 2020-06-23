package br.com.mastertech.validacadastro.consumers;

import br.com.mastertech.empresa.Empresa;
import br.com.mastertech.validacadastro.services.ValidaCadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ValidaCadastroConsumer {

    @Autowired
    private ValidaCadastroService validaCadastroService;

    @KafkaListener(topics = "spec2-daniel-victor-2", groupId = "teste")
    public void listen(Empresa empresa) {
        validaCadastroService.validaCapital(empresa);
    }
}
