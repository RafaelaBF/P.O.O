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

> **OBS**.: Para usar o modo escuro vá: <br>
> ` Windows > preferences > General > Apperance > `


## Quadros Anotados da Aula 2

- Uma classe é o projeto de um objeto.
- Ela informa ao Java como criar um objeto desse tipo específico. Cada objeto criado a partir dessa classe terá seus próprios valores para as variáveis de instância da classe.

## Anotações Soltas

---
A classe é um molde. Por exemplo: um cão pode ter tamanho, raça e nome, e a classe cão podem ser vários cãos diferentes com tamanhos, raças e nomes diferentes.

```java
public class Cao {
  double tamanho;
  String raca;
  String nome;
}
```
---
Para criar um novo objeto a partir de uma classe, crie uma nova instância do objeto.

Dentro do public static void main(String[] args):

```java
public static void main(String[] args){
  Cao caoObj = new Cao();

  caoObj.nome = "Bidu";
  caoObj.raca = "Pastor Alemão";
  caoObj.tamanho = 20.4;
}
```

> **OBS**.: Acima, chamamos o processo de colocar os valores em um objeto instanciado é "_Popular_"
---

Quando um objeto é criado, a variavel que está associada a ele, está somente "apontando" para esse unico objeto. Ou seja, caso uma outra variavel do tipo do objeto seja criada, e associada a uma outra variável, ela somente apontará para o mesmo lugar que o objeto inicial.

Execute o código [DesafioDeProva.java]()

```java
Cao c1 = new Cao();
c1.nome = "Bidu";

Cao c2 = new Cao();
c2.nome = "Pluto";

Cao c3 = c1;
c3.nome = "Toto";

System.out.println(c1.nome);
```

> output: Toto



