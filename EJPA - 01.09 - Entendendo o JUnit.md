# Entendendo o JUnit

Foi criado um projeto para testar a aplicação.

Repositório do projeto: [Entendendo o JUnit](../especialista-jpa/entendendo-junit/)


## Breve passagem por Testes Unitários com JUnit

_OBS: Não será abordado o JUnit mas será utilizado para testar a aplicação_

### Ciclos dos testes unitários com JUnit

#### @Test
    Anotação que indica que o método em questão é um método de teste.

#### @Before
    Anotação que indica que, todo teste que for executado deverá executar primeiramente o método que estiver anotado com o @Before.

#### @After
    Anotação que indica que, todo teste que for executado deverá, ao finalizar deverá executar também o método que estiver anotado com o @After.

#### @BeforeClass
    Anotação que indica que, sempre será executado antes de todos os outros testes o método que estiver anotado com @BeforeClass. Este método precisa ser estático.

#### @AfterClass
    Anotação que indica que, sempre será executado ao final de todos os outros testes o método que estiver anotado com @AfterClass. Este método precisa ser estático.

### Assertions
- São validações que podemos fazer para "assegurar/garantir" que o que está sendo executado é o que é esperado.

#### Assert.assertEquals()
    Valida a igualdade das saídas. Precisa ser passado dois parâmetros sendo, primeiro é o valor esperado, e depois o valor executado. 
    
Exemplo:

```java
String nome = String.format("%s", "André");
```

#### Assert.assertTrue()
    Valida se o esperado é true.

Exemplo:
```java
@Test
public void testandoOutraCoisaComAcersões() {
    String s = String.format("%s", "");

    Assert.assertTrue(s.isEmpty());
}
```