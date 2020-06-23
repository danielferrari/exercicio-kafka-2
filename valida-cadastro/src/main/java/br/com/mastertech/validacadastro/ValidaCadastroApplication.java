package br.com.mastertech.validacadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ValidaCadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidaCadastroApplication.class, args);
	}

}
