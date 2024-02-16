# README

Este repositório contém um projeto que demonstra a configuração e utilização de um banco de dados PostgreSQL em conjunto com uma aplicação Java utilizando Spring Boot e JPA.

Para executar o projeto localmente, siga estas etapas:

- Certifique-se de ter o Docker instalado em sua máquina. Se não tiver, você pode baixá-lo em [docker.com](https://www.docker.com/get-started).

- Baixe a imagem do PostgreSQL executando o seguinte comando no terminal:

    ```
    docker pull postgres
    ```

- Inicie o contêiner do PostgreSQL executando:

    ```
    docker-compose up -d
    ```

- Acesse o banco de dados pelo terminal utilizando o seguinte comando:

    ```
    psql -U admin -d <nome_banco>
    ```

- Para remover o contêiner e seus volumes de dados, execute:

    ```
    docker-compose down -v
    ```

- Se você encontrar problemas com a configuração padrão, pode iniciar um contêiner com as configurações desejadas executando:

    ```
    docker run --name <nome_banco> -e POSTGRES_PASSWORD=admin -d postgres
    ```

## Configuração da Aplicação

- Instale a extensão Database Client em sua IDE.

- Configure o banco de dados PostgreSQL conforme os dados fornecidos no arquivo `docker-compose.yml`.

- Configure as anotações do Hibernate nas entidades para mapear os relacionamentos do banco de dados.

## ORM e Repositories

- O projeto utiliza o Hibernate como ORM (Object Relational Mapper) para mapear objetos Java para o banco de dados. 

- Os repositórios são criados estendendo a interface JpaRepository para interagir com o banco de dados.

## Endpoints da Aplicação

- `http://127.0.0.1:8081/students/create`: Endpoint para criar um novo estudante. Exemplo de insert com JSON:

    ```json
    {
      "id": "d65104c2-d4e8-4f5b-a5c3-2e57a8cb490d",
      "createdAt": "2024-02-15T22:00:00",
      "email": "heannareis@email.com"
    }
    ```

- `http://127.0.0.1:8081/firstcontroller/firstControllerReturn`: Endpoint para retornar algo do primeiro controlador.

- `http://127.0.0.1:8081/students/verifyhascertification`: Endpoint para verificar se um estudante possui certificação.

## Considerações Finais

Após enfrentar problemas de desempenho devido à utilização de vários recursos em minha máquina, como WSL, Docker, VSCode, APIDog e Google Chrome, resolvi migrar para o PostgreSQL.

Apesar de ter experimentado alguns problemas com a manipulação de caracteres especiais, o PostgreSQL mostrou-se mais eficiente para a aplicação em questão.

Embora tenha enfrentado dificuldades que me impediram de concluir as aulas do NLW da Rocketseat, considero que foi uma jornada valiosa, pois aprendi a configurar e adaptar a aplicação para diferentes ambientes e bancos de dados.
