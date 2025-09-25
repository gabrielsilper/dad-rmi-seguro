# DAD-RMI-SEGURO

Repositório do trabalho em grupo para criar um sistema RMI. Este módulo é responsável pela parte de seguros.

## Pré-requisitos

- [Docker](https://www.docker.com/) e [Docker Compose](https://docs.docker.com/compose/) instalados
- [Maven](https://maven.apache.org/) instalado

## Passo a Passo para Iniciar o Servidor RMI

### 1. Clonar o Repositório

```bash
git clone <URL_DO_REPOSITORIO>
```

### 2. Preparar o Projeto `dad-seguro-devkit`

- Abra o projeto `dad-seguro-devkit` no IntelliJ IDEA.
- No terminal, navegue até o diretório raiz do projeto e execute:

    ```bash
    mvn clean install
    ```
- Isso irá compilar o projeto e instalar o artefato no repositório local do Maven.

### 3. Preparar o Projeto `dad-seguro-server`

- Abra o projeto `dad-seguro-server` no IntelliJ IDEA.
- Abra o arquivo `pom.xml` e atualize o projeto para baixar todas as dependências, incluindo a referência ao `dad-seguro-devkit`.

### 4. Executar o Container MySQL

Já existe um arquivo `docker-compose.yml` no diretório `dad-seguro-server` que configura um container MySQL.

No terminal, navegue até o diretório `dad-seguro-server` e execute:

```bash
docker-compose up -d
```

Para verificar se o container está rodando:

```bash
docker ps
```

### 5. Iniciar o Servidor RMI

- No IntelliJ IDEA, execute a classe `SeguroServerMain` para iniciar o servidor RMI.

---

Siga os passos acima para configurar e iniciar o servidor RMI do módulo de seguros.
