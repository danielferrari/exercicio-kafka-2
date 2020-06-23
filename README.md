# Validação de cadastro de empresas

## Microsserviços

- **empresa**: realiza o cadastro das empresas e envia para o tópico 1
- **valida-cadastro**: realiza validação dos dados enviados pelo microsserviço de empresa e envia as empresas válidas para o tópico 2
- **log-cadastro**: recebe as empresas válidas por listener do Kafka e grava em um arquivo de log

## Tópicos Kafka
- **1 - spec2-daniel-victor-2**: empresas cadastradas
- **2 - spec2-daniel-victor-3**: empresas válidas
