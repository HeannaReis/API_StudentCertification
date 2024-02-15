
Caso não tenha uma imagem do postgreSQL.

- docker pull postgres

Acessar o banco pelo terminal
psql -U admin -d <nome_banco>


docker version

- iniciar container
docker-compose up -d
- Baixar container porém remove os dados e volumes.
docker-compose down -v
- Se houver problemas por ser uma configuração nova.
docker run --name <nome_banco> -e POSTGRES_PASSWORD=admin -d postgres




- Instalar Extensão Database Client
- Configurar banco posgress conforme dados enviados no docker-compose.yml
- Configurar as aotações Entity MappedBy ManyToOne e OneToMany ManyToMany e outras para definir as regras dos relacionamentos.



ORM --> Object Relational Mapper


Repository --> Interagir com Banco de Dados

Criar os repositórios extendendo de JpaRepository, criar os métodos que forem necessários.
Configurar a utilização nas controllers e criar o mapeamento dos end points e PathVariables.



http://127.0.0.1:8081/firstcontroller/firstControllerReturn

http://127.0.0.1:8081/students/verifyhascertification


Após problemas com consumo de memória devido utilizar WSL, Docker, VSCode, APIDog e o Google Chrome
meu notebook de 8G de RAM começou a perder muita performance, então resolvi migrar para o MySql que já utilizava