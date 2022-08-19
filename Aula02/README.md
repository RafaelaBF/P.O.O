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

### Debug

Para utilizar a função de _Debug_ no Eclipse, primeiro é necessário colocar um `ponto de parada` nas linhas do código.
Ao rodar o _Debug_, o programa rodará até esse ponto de parada, e a partir dele rodará linha por linha.

Para colocar este ponto de parada, ao lado esquerdo dos indicadores da linha: <br>

> ` Botão direito > Toggle Breakpoint ` <br>

Depois, no espaço do arquivo .java:

> ` Botão direito > Debug As > Java Application `

> **OBS**.: No primeiro Debug, o Eclipse perguntará se você deseja trocar para a Perspectiva de Debug, onde é possível visualizar as **variáveis**, e as etapas feitas durante funcionamento do código.

É possível controlar o fluxo do código a partir do Breakpoint definido com as seguintes funções no canto superior da IDE:

Resume: Continuar o código
Suspend: Pausar
Terminate: Parar o debug

Step Into: Proxima linha
Step Return: Voltar para a linha anterior
Step Over: Pular a linha


## Quadros Anotados da Aula 2

- Uma classe é o projeto de um objeto.
- Ela informa ao Java como criar um objeto desse tipo específico. Cada objeto criado a partir dessa classe terá seus próprios valores para as variáveis de instância da classe.

---

- As coisas que um objeto **conhece** sobre ele são chamadas de **variáveis de instancia**. elas representam o estado de um objeto (os dados) e podem ter valores exclusivos para cada objeto desse tipo.
- considere **instancia** como outra maneira de dizer **objeto**.
- As coisas que um objeto faz são chamadas de **métodos**. Quando projetar uma classe, você pensará nos dados que um objeto terá que conhecer sobre si mesmo e também projetará os métodos que operarão sobre esses dados. É comum um objeto ter métodos que leiam ou gravem os valores das variáveis de instância. Por exemplo, os objetos Despertador tem uma variável de instância que armazena a hora de despertar e dois métodos que capturam e configuram essa hora.
- Portanto, os objetos têm variávels de instância e métodos, mas essas variáveis de instância e métodos são projetadas como parte da classe.

---

- As declarações de variáveis consistem de um tipo e um nome de variável. Exemplo:
  - int idade;
  - String nome;
  - Boolean existe;
  - double numero;

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

---

Booleans em Java só aceitam True ou False.


