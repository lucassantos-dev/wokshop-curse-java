# Projeto Web Services com Spring Boot, JPA e Hibernate

Este projeto é parte do curso Java completo da DevSuperior e tem como objetivo criar um serviço web usando Spring Boot, JPA e Hibernate. O projeto abrange desde a criação do projeto até o deploy na plataforma Heroku, passando por diversas etapas de desenvolvimento e configuração.

## Objetivos
- Criar um projeto Spring Boot Java.
- Implementar o modelo de domínio.
- Estruturar camadas lógicas: resource, service, repository.
- Configurar banco de dados de teste (H2).
- Povoar o banco de dados.
- CRUD - Create, Retrieve, Update, Delete.
- Tratamento de exceções.

## Estrutura do Projeto
O projeto está organizado nas seguintes camadas:
- **Resource**: Camada responsável por expor endpoints da API.
- **Service**: Camada de lógica de negócios.
- **Repository**: Camada de acesso ao banco de dados.

## Tecnologias Utilizadas
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database** (para testes)
- **PostgreSQL** (para produção)
- **Heroku** (para deploy)

## Configuração do Ambiente de Desenvolvimento

### Dependências do Maven
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```
### Configuração dos Perfis

#### application.properties

```properties
spring.profiles.active=test
spring.jpa.open-in-view=true
```

#### application-test.properties

```properties
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Rodando a Aplicação

Para rodar a aplicação localmente:

1. Certifique-se de que o PostgreSQL está instalado e rodando.
2. Crie um banco de dados chamado `springboot_course`.
3. Configure o `application-dev.properties` com as credenciais do PostgreSQL.
4. Execute a aplicação usando seu IDE ou através do comando Maven:

```bash
./mvnw spring-boot:run
