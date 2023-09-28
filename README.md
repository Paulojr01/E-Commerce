# E-Commerce API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

Este projeto é uma API construída usando **Java, Spring Framework, banco de dados PostgreSQL, Spring Security e JWT para controle de autenticação.**

A API está sendo desenvolvida com o intuito de aplicar os conhecimentos adquiridos ao longo dos meus estudos acadêmicos.


## Índice

- [instalação](#instalação)
- [Uso](#Uso)
- [API Endpoints](#api-endpoints)
- [Autenticação](#Autenticação)
- [Base de dados](#BaseDeDados)
- [Contribuição](#contribuição)

## instalação

1. Clonar o repositório:

```bash

git clone https://github.com/Paulojr01/E-Commerce.git

```

2. Instale dependências com Maven

3. Instale o PostgreSQL [PostgresSQL](https://www.postgresql.org/)

## Uso

1. Inicie o aplicativo com Maven
2. A API estará acessível em http://localhost:8080


## API Endpoints

A API fornece os seguintes endpoints:

```markdown
GET /users - Recupera uma lista de todos os usuários.(Somente usuários logados como ADMIN podem acessar).

GET /users/id - Recupera um usuário específico.

DELETE /users/id - Deleta um usuário específico.

PUT  /users/id - Atualizada um usuário específico.

POST /auth/register - Para registra um novo usuário

POST /auth/login - Para logar no app

GET /categories - Recupera uma lista de todas as categorias.

GET /categories/id - Recupera um categoria específica.

GET /orders - Recupera uma lista de todos os pedidos.

GET /orders/id - Recupera um pedido específico.

GET /products - Recupera uma lista de todos os produtos.

GET /products/id - Recupera um produto específico.

POST /auth/login - Login into the App

POST /auth/register - Register a new user into the App
```

## Autenticação

A API usa Spring Security para controle de autenticação. As seguintes funções estão disponíveis:
```
USER -> Função de usuário padrão para usuários logados.
ADMIN -> Função administrativa para administradores (Busca de todos usuários).
```
Para acessar endpoints protegidos como usuário ADMIN, forneça as credenciais de autenticação apropriadas no cabeçalho da solicitação.

## Base de dados

O projeto utiliza [PostgresSQL](https://www.postgresql.org/) como banco de dados.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, abra um problema ou envie uma solicitação pull ao repositório.

Ao contribuir para este projeto, siga o estilo de código existente, e envie suas alterações em um branch separado.
