package br.com.mastertech.logcadastro.consumers;

import br.com.mastertech.validacadastro.dtos.EmpresaDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class LogCadastroConsumer {

    @KafkaListener(topics = "spec2-daniel-victor-3", groupId = "teste")
    public void listen(@Payload EmpresaDTO empresaDTO) throws IOException  {
        File csvFile = new File("empresa.csv");

        try(PrintWriter pw = new PrintWriter(new FileOutputStream(csvFile, true))) {
            pw.println(
                    empresaDTO.getCnpj() + "," +
                    empresaDTO.getCapitalSocial()
            );

            System.out.println("Eempresa com cnpj: " + empresaDTO.getCnpj() + " gravada no arquivo " + csvFile.getAbsolutePath());
        }

        System.out.println("Recebida empresa com cnpj: " + empresaDTO.getCnpj() + " com capital social de " + empresaDTO.getCapitalSocial());
    }
}
