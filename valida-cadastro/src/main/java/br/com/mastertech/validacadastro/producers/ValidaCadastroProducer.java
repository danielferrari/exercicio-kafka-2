package br.com.mastertech.validacadastro.producers;

import br.com.mastertech.validacadastro.dtos.EmpresaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ValidaCadastroProducer {

    @Autowired
    private KafkaTemplate<String, EmpresaDTO> producer;

    public void sendToKafka(EmpresaDTO empresaDTO) {
        producer.send("spec2-daniel-victor-3", empresaDTO);
    }
}
