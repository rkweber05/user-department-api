# 🛠️ API REST com Spring Boot

Este projeto é uma API RESTful construída com **Java** e **Spring Boot**. A API segue o padrão **CRUD** (Create, Read, Update, Delete) e utiliza um banco de dados em memória **H2** para armazenamento. O mapeamento de entidades é feito através do **JPA**.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database**
- **Maven**
- **Lombok**

## ✅ Pré-requisitos

- **JDK 17** ou superior
- **Maven 3.x**
- **IDE** (recomendado: IntelliJ IDEA ou Eclipse)
- **Postman** ou outra ferramenta de teste de API (opcional)

## ⚙️ Clonar repositório
   git clone https://github.com/seu-usuario/seu-repositorio.git

## 🗄️ Configuração do Banco de Dados
    A aplicação utiliza o H2 Database, um banco de dados em memória. A configuração padrão pode ser encontrada no arquivo application.properties:   
    
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    spring.h2.console.enabled=true

## 🗄️ Para acessar o console do H2, você pode ir para http://localhost:8080/h2-console e usar as seguintes credenciais:
    User Name: sa
    Password: (deixe em branco)    

## 🔗 Endpoints
    A API oferece os seguintes endpoints:

  * ➕ Criar Recurso (Create)
    POST /api/recursos
    Corpo da requisição: application/json

  * 📜 Listar Recursos (Read)
    GET /api/recursos
    Retorna todos os recursos.

  * 🔍 Buscar Recurso por ID (Read)
    GET /api/recursos/{id}
    Retorna o recurso correspondente ao ID.

  * ✏️ Atualizar Recurso (Update)
    PUT /api/recursos/{id}
    Corpo da requisição: application/json

  * 🗑️ Excluir Recurso (Delete)
    DELETE /api/recursos/{id}

## 📝 Licença
      Este projeto está licenciado sob a MIT License.
