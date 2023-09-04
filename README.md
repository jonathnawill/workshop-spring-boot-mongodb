# Spring Boot e MongoDB

## Sinopse

Projeto utilizando boas práticas de Engenharia de Software tais como desenvolvimento em camadas (DDD) e tratamento de exceções.
Também são realizadas operações de CRUD, consultas com @Query, retorno de objetos agregados (Banco de dados MongoDB).

![UML](https://github.com/jonathnawill/workshop-spring-boot-mongodb/assets/104990020/e4f13d22-21c1-4b62-9a48-b218a88b6104)

## Índice
- [Description](#description)
- [Technologies Used](#technologies-used)
- [Endpoints](#endpoints)
- [Getting Started](#getting-started)
- [Contributing](#contributing)

## Descrição do projeto
Este projeto foi desenvolvido usando o Spring Boot e o MongoDB e visa fornecer uma plataforma na qual os usuários possam criar postagens e adicionar comentários. A principal entidade do projeto é o objeto Post, que representa uma postagem feita por um usuário. Cada postagem pode ter vários comentários associados a ela.

O projeto implementa todas as operações básicas do CRUD ( Criar, Ler, Atualizar, Excluir ) para gerenciar usuários, postagens e comentários. Os usuários podem se registrar, criar novas postagens, adicionar comentários às postagens existentes e executar outras ações essenciais.

## Tecnologias Usadas
- JDK 15
- Spring Boot
- Maven
- Postman
- MongoDB Community Server
- MongoDB Compass

## Endpoints
The application exposes the following endpoints:

| Endpoint          | Description                                 |
| ----------------- | ------------------------------------------- |
| `/users`          | Get all users                               |
| `/users/{id}`     | Get a specific user by ID                   |
| `/users/`         | Create a new user                           |
| `/users/{id}`     | Delete a user by ID                         |
| `/users/{id}`     | Update a user by ID                         |
| `/users/{id}/posts` | Get all posts by a specific user           |
| `/posts`          | Get all posts                                |
| `/posts/{id}`     | Get a specific post by ID                    |
| `/posts/titlesearch` | Search posts by title                     |
| `/posts/fullsearch` | Search posts by full text                  |
| `/posts`          | Create a new post                            |
| `/posts/{id}`     | Delete a post by ID                          |
| `/posts/{id}`     | Update a post by ID                          |

## Como utilizar
Para começar o projeto, siga estas etapas:

# Clone o repositório.
1.  Instale o JDK 15 e configure o ambiente.
2.  Instale e configure o MongoDB Community Server e o MongoDB Compass.
3.  Construa o projeto usando o Maven.
4.  Execute o aplicativo usando o Spring Boot.
5.  Use Postman ou qualquer ferramenta de teste de API para interagir com os pontos finais expostos.
