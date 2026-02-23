# Itaú Unibanco - Desafio Backend

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)](https://swagger.io/)

Este repositório contém a minha solução para o [Desafio Backend do Itaú (Vaga 99 Júnior)](https://github.com/rafaellins-itau/desafio-itau-vaga-99-junior). O objetivo do projeto é construir uma API REST que recebe transações financeiras e retorna estatísticas em tempo real, considerando apenas as transações que aconteceram nos últimos 60 segundos.

## 💻 Tecnologias e Ferramentas Utilizadas

* **Java**
* **Spring Boot** para o desenvolvimento da API REST
* **Lombok** para redução de código boilerplate
* **SpringDoc OpenAPI (Swagger)** para documentação interativa da API
* **Maven** para gerenciamento de dependências e build
* *(Nota: Conforme as regras do desafio, nenhum banco de dados ou sistema de cache em memória externo foi utilizado. Todos os dados são armazenados nativamente em memória na própria aplicação).*

## ⚙️ Funcionalidades

* **Registro de Transações (`POST /transacao`):** Recebe e armazena transações contendo `valor` e `dataHora`.
  * Validação estrita para rejeitar transações com data/hora no futuro.
  * Validação para rejeitar valores negativos.
  * Respostas HTTP padronizadas (`201 Created` para sucesso, `422 Unprocessable Entity` ou `400 Bad Request` para erros de validação).
* **Cálculo de Estatísticas (`GET /estatistica`):** Retorna estatísticas (`count`, `sum`, `avg`, `min`, `max`) calculadas com base nas transações registradas nos últimos 60 segundos.
* **Limpeza de Dados (`DELETE /transacao`):** Apaga todos os registros de transações armazenados na memória.

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java
* Maven

### Passos

1. Clone este repositório:
```bash
git clone [https://github.com/AlissonSimon/desafio-backend_itau-unibanco.git](https://github.com/AlissonSimon/desafio-backend_itau-unibanco.git)
```

2. Acesse a pasta do projeto:
```bash
cd desafio-backend_itau-unibanco
```

3. Compile e execute a aplicação via Maven:
```bash
mvn spring-boot:run
```

## 🌐 Acessando a Documentação

Com a aplicação rodando, você pode acessar:

    Swagger UI (Documentação da API): http://localhost:8080/swagger-ui.html (Use esta interface para testar os endpoints diretamente pelo navegador!)
