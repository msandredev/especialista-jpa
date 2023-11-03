# Banco de dados MySQL

No curso será utilizado o MySQL mas no meu caso, irei utilizar o MySQL em um container do Docker.

Pra isso, como já tenho o Docker instalado, primeiramente precisei executar os comandos abaixo: 

1. Baixar a imagem: 
 ```yml
docker pull mysql:latest
```
    
2. Criar volume:
```yml
docker volume create mysql-data
```

3. Criar o container expondo a porta _`3306`_:
```yml
docker run --name mysql80 -d -p 3306:3306 -v mysql-data:/var/lib/mysql mysql:latest
```

4. Executar o container: 
```yml
docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=secret -d mysql:latest --general-log=on
```
