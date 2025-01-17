# Tech Challenge

## O QUE É A APLICAÇÃO :

Essa é uma aplicação de gerenciamento de usuários, incluindo operações de
criação, atualização, exclusão e validação de login.

## FUNCIONALIDADES :

- Encontra uma pessoa registrada no sistema por ID.
- Encontra uma lista de pessoas registradas no sistema.
- Registra uma pessoa no sistema.
- Atualiza dados de uma pessoa do sistema.
- Deleta uma pessoa do sistema.

## VERSIONAMENTO :

Versão do Java: 17

Versão do Spring Boot: 3.0.2

## FERRAMENTAS :

Back end:

      - Java
      - Spring Data JPA
      - Maven

Dependências:

     Data JPA - > Utilizando o JPA para fazer a ponte entre o banco de dados e a aplicação -> ORM

     Web -> É uma aplicação WEB, Utilizado para receber requisições, devolver uma resposta ...

     PostgreSQL -> Utilizado esse BANCO no ambiente de desenvolvimento e produção.

     LomBok -> Utilizado para evitar muitas linhas de código através de annotations.

Programas Utilizados :

    Postman - Utilizado para fazer as requisições (CONSUMIR) a aplicação.
    
    IntelliJ - IDE escolhida para desenvolver o projeto.
    
    pgAdmin4 - Plataforma utilizada para fazer a manipulação e a leitura dos dados de uma base de dados do banco PostgreSQL.
    
    Git e GitHub - Utilizados para commitar o projeto e subir o código para a nuvem(remoto).

Bancos de Dados :

    PostgreSQL - Usado em ambiente de desenvolvimento e produção.

Compilar o projeto :

    mvn clean package

Subir o Contêiner :

    docker-compose up --build