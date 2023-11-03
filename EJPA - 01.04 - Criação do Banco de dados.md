# Criação do banco de dados

Abaixo será criado o banco de dados de exemplo.

```sql
create database cadastroevento;
```

Aqui está sendo criada a tabela de eventos:

```sql
use cadastroevento;

create table evento (
    id bigint not null auto_increment,
    nome varchar(60) not null,
    data datetime not null,
    primary key(id)
);
```

```sql
insert into evento(id, nome, data) values (null, 'Palestra Especialista JPA', sysdate());
```