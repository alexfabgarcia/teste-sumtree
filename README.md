# teste-sumtree
Projeto criado com Spring Boot para facilitar testes de soma de elementos subsequentes de um nó de uma árvore binária.

## Pré-Requisitos
[JDK 8](http://lmgtfy.com/?q=install+jdk+8) instalado.

## Compilação
O projeto contém a versão wrapped do [Maven](https://maven.apache.org/) que pode ser utilizada para compilação, através do seguinte comando:
```
.\mvnw clean package
```

## Execução/Testes
Este projeto foi criado com o intuito de facilitar o desenvolvimento da função de soma de nós subsequente via TDD. Assim, não possui funcionalidade em sua execução.

A classe de teste SumtreeApplicationUnitTests resume os testes realizados sobre a função. Para executá-la sem empacotar a aplicação, utilize o seguinte comando:
```
.\mvnw clean test
```
