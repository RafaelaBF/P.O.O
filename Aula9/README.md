# Aula 9



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

Ao criar classes sem uma definição concreta, como Animal (pode ser um cachorro, gato, papagaio, etc), utilizamos a keyword _abstract_.

```java
public abstract class Animal {
}
```

A partir do momento que colocamos uma classe como abstrata, não conseguimos criar um objeto da classe que é definido como abstrata.

```java
public static void main(String[] args){
  Animal x = new Animal();
}
```

> Dá erro de compilação, pois a classe Animal foi definida como _abstract_.

Porém, caso seja alguma classe que extende a classe abstrata, é possível.

```java
public abstract class Animal {
  private String nome;
  public void setNome(String s){
    this.nome = s;
  }
}
```

```java
public class Leao extends Animal {
  
}
```












## Pacotes principais

Todas as classes que estão no pacote java.lang já vem importadas por default no java.

classes como Integer, Double, String, e etc.

Não precisamos fazer import dela pois o java já os importa por padrão.

## Palavras reservadas

- final
- class
- public
