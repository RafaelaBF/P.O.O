# Aula 2
Aula usando a IDE Eclipse.

## Usando o Eclipse

- Primeiro, criamos o projeto Aula2. Para criar o projeto, faça o seguinte caminho:<br>
  > `Menu > File > New > Project > Java Project`

- Src -> Sorce code
  > Os códigos estaram sempre dentro dessa pagina, apos criar projeto.

- Criar uma class <br>
  > `Botão direito no src > New > Class`

- Para passar parâmetros dentro do Eclipse: <br>
  > `Botão direito no espaço do arquivo .java > Run As > Run Configurations > Arguments` <br>

> **P.S**: Para usar o modo escuro vá: <br>
> ` Windows > preferences > General > Apperance > `


## Quadros Anotados da Aula 2

- Uma classe é o projeto de um objeto.
- Ela informa ao Java como criar um objeto desse tipo específico. Cada objeto criado a partir dessa classe terá seus próprios valores para as variáveis de instância da classe.

## Anotações Soltas

A classe é um molde. Por exemplo: um cão pode ter tamanho, raça e nome, e a classe cão podem ser vários cãos diferentes com tamanhos, raças e nomes diferentes.

```java
public class Cao {
  float tamanho;
  String raca;
  String nome;
}
```



para criar um novo objeto a partir de uma classe, crie uma nova instância do objeto.

dentro do psvm:

Cao caoObj = new Cao();

caoObj.nome = "Bidu";
caoObj.raca = "Pastor Alemão";
caoObj.tamanho = 

OBS: isso aq de cima, de colocar os valores de um objeto instanciado é "Popular"
