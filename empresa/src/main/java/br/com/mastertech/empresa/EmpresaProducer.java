package br.com.mastertech.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpresaProducer {

    @Autowired
    private KafkaTemplate<String, Empresa> producer;

    public void sendToKafka(Empresa empresa) {
        producer.send("spec2-daniel-victor-2", empresa);
    }
}
