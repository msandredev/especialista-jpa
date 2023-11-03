# Executando o MySQL Cliente via Terminal

Para executar o MySQL Client pelo Terminal do Linux, precisei instalar o mysql-client:
> sudo apt install mysql-client

Após instalado, ao tentar executá-lo, foi apresentado um erro informando que o arquivo `mysqld.sock` não existia. Então precisei criálo, inclusive criar o diretório onde ele deveria estar e dar permissão ao usuário `mysqld`:


```bash
# Verifique se o usuário mysql existe
sudo grep mysql /etc/passwd

# Não existe, crie o usuário
sudo useradd mysql

# Conceda ao usuário mysql permissão para acessar o arquivo mysqld.sock
sudo chmod 660 /var/run/mysqld/mysqld.sock

# Crie o arquivo mysqld.sock
sudo touch /var/run/mysqld/mysqld.sock

# Verifique se o arquivo mysqld.sock existe
ls /var/run/mysqld/mysqld.sock

# Agora você pode executar o comando chown sem erros
sudo chown mysql /var/run/mysqld/mysqld.sock
```

Ainda assim continuou com alguns erros, e após várias tentativas, então decidi criar o container via docker compose da seguinte maneira:

1. Criar um arquivo chamado `docker-compose.yml`
2. Incluir isso no arquivo:
    ```yml
    version: '3.8'

    services:
    mysql:
        image: mysql:latest
        volumes:
        - /var/run/mysqld:/var/run/mysqld
        environment:
        MYSQL_ROOT_PASSWORD: root
        ports:
        - 3306:3306
    ```
3. Executar o comando `docker-compose up -d` na raiz (onde está salvo o arquivo) para que o container seja iniciado:
    - Expondo a porta 3306 para que seja acessada localmente
    - Expondo o volume do mysql para que possa ser executado o mysql via terminal local sem a necessidade de entrar no container através do comando:
        ```bash 
        mysql -h localhost -P 3306 -u root -p
        ```
> _OBS: O que me levou a fazer essa mudança para o Docker Compose foi que o container do MySQL, ao ser inicializado, inicia também o serviço do MySQL, o que não permite fazer a exposição do volume pelo arquivo mysqld.sock pois o mesmo está em uso_: 
> ```bash
> /var/run/mysqld/mysqld.sock
> ```

4. Após iniciar o container é possível utilizar o MySQL Client via terminal:
> mysql -h localhost -P 3306 -u root -p