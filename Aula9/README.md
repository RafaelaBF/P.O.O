# Aula 9

:warning: Essa aula teve MUITA coisa. [Clique em caso de duvida](https://www.google.com/) ;) :warning:



> OBS.: Tem mais anotações nos códigos

## Keyword final

### Classes

Ao definir uma classe como "final", nenhuma outra classe pode herdar ela, ou seja, ela não pode ter subclasses.

> ex.: 

```java
public class Str extends String {

}
```

Dá erro de compilação, pois a classe String é definida como _final_.

```java
public final class String{
}
```

### Variáveis

Ao atribui-las a variáveis, você as torna em constantes, ou seja elas só podem possuir um único valor imutável.

```java
public class ABC {
  public final String DIRETORIO = "C:/teste";
}
```

> OBS.: Por boas práticas, constantes devem ser declaradas com nomes em **CAPS LOCK**.

### Métodos

Ao colocarmos o final em um método, não é possível sobrescreve-lo em subclasses.

```java
public class Animal(){
  public final void correr(){
    //dessa forma, todas as classes derivadas de Animal vão ter o mesmo método correr(), sem possibilidade de sobrescreve-lo em subclasses.
  }
}
```

```java
public class Leao extends Animal{
  public void correr(){
    System.out.println("Leao correndo");
  }
}
```

> !!! Dá erro de compilação, pois o método correr() da classe mãe é _final_. !!!

## Keyword Abstract

### Classes

Ao criar classes sem uma definição concreta, como Animal (pode ser um cachorro, gato, papagaio, etc), utilizamos a keyword _abstract_.

```java
public abstract class Animal {
}
```

A partir do momento que colocamos uma classe como abstrata, não conseguimos criar um objeto dessa classe.

```java
public static void main(String[] args){
  Animal x = new Animal(); //erro de compilacao
}
```

> Dá erro de compilação, pois a classe Animal foi definida como _abstract_.

Porém, caso seja alguma classe que extende a classe abstrata, é possível.

```java
public abstract class Animal {
  private String nome;
  public Animal(String s){
    this.nome = s;
  }
}
```

```java
public class Leao extends Animal {
  public Leao(String s){
    super(s);
  }
}
```

### Métodos

**ATENÇÃO!!!!!**

**MÉTODOS ABSTRATOS NÃO POSSUEM CODIGO.**

**VAI CAIR NA PROVA E SE ERRAR VAI PERDER PONTO**

Ao definir um método como abstract, ele não deve possuir código, pois ele obriga a **ocorrência da sobrescrita nas subclasses**.

> Arquivo: Animal.java

```java
public abstract class Animal {
  private String nome;
  public void setNome(String s){
    this.nome = s;
  }
  public abstract void comer();
  public abstract void comer();
}
```

> Arquivo: Gato.java

```java
public class Gato extends Animal {
  public void comer(){
    System.out.println("Gato está comendo...");
  }
  public void correr(){
    System.out.println("Gato está correndo...");
  }
}
```

Podemos criar um vetor de uma classe abstrata, pois estamos só criando espaços na memória para receber um tipo de classe, e suas subclasses.

```java
Animal x[] = new Animal[3];
x[0] = new Gato(); //compila
x[1] = new Cachorro(); //compila
x[2] = new Animal(); //não compila
```

### Regras keyword abstract

pra voce ter um metodo abstrato, voce precisa obrigatoriamente que a classe seja abstrata
uma classe abstrata pode ter n metodos abstratos, n metodos concretos, n variaveis, etc
podemos ter uma outra

## Pacotes principais

Todas as classes que estão no pacote java.lang já vem importadas por default no java.

classes como Integer, Double, String, e etc.

Não precisamos fazer import dela pois o java já os importa por padrão.

## Palavras reservadas

- final
- class
- public

## Interface

Uma interface é como se fosse uma classe abstrata com **todos os métodos abstratos**.
Ou seja, não é necessário definir os métodos como public, ou abstract, e etc.

Já as variáveis, são todas definidas como **public static final**.

Toda classe concreta que implemente a interface, ela obrigatoriamente vai ter que implementar todos os métodos daquela interface.

Para "importar" uma interface, é necessário usar a keyword `implements`.

> Arquivo: Voador.java

```java
public interface Voador {
  void levantarVoo();
  void pousar();
  void voar();
}
```

> Arquivo: Veiculo.java

```java
```

> Arquivo: Animal.java

```java
```

> Arquivo: Aviao.java

```java
```

> Arquivo: Passaro.java

```java
```

Dessa forma, é possível executar os métodos específicos das subclasses sem especificar com ifs e instanceofs.

> Arquivo: Main.java

```java
public static void main(String[] args){
  Voador[] x = new Voador[3];
  x[0] = new Aviao();
  x[1] = new Aviao();
  x[2] = new Passaro();

  for(int i = 0; i < x.length; i++){
    x[i].levantarVoo();
  }
}
```

> OBS.: A quantidade de classes a serem extendidas é restrita a UMA
>       Porém, a quantidade de interfaces a serem implementadas não possui limites.

> Arquivo: Oviparo.java

```java
```

> Arquivo: Passaro.java

```java
```

## anotações soltas

- não existe herança multipla em java
