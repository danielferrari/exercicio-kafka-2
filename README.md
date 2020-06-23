# Validação de cadastro de empresas

## Microsserviços

- **cadastro**: realiza o cadastro das empresas enviando para fila do Kafka
- **valida-cadastro**: listener do Kafka que realiza validação envia os dados para o microsserviço de logs
- **log-cadastro**: recebe o resultado da validação via endpoint REST e grava em um arquivo de log
