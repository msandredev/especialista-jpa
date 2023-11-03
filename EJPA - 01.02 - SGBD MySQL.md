# SGBD MySQL

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

3. Criar o container expondo a porta _`3306`_ e o volume (mysqld.sock):
```yml
docker run --name mysql -d -p 3306:3306 -v /var/run/mysqld/mysqld.sock:/var/run/mysqld/mysqld.sock -e MYSQL_ROOT_PASSWORD=root mysql:latest
```
