# Aula 8

Na aula passada, foi visto o conceito de _sobrescrita_ (override), e a _sobrecarga_ (overload)

# Sobrescrita

> Obs.: <h1>Não tem sobrescrita de construtor!!!!!</h1> Os construtores são unicos para cada classe, então não tem como o construtor da classe Leao sobrescrever o da classe Animal, já que são construtores diferentes.

Porém, da pra sobrescrever um método de nome igual, onde na classe mãe tem um método geral, e a classe filha pode ter um método de nome igual para sobrescrever no caso específico dela.

* inserir exemplo *



# Sobrecarga

A sobrecarga é ter um metodo ou construtor com o mesmo **nome**, e assinaturas diferntes (parâmetros diferentes).

Dessa forma, é possível puxar vários atributos de uma unica vez, ou puxar atributos especificos.

> Ex.:

```java
public class ExemploSobrecarga {
  public static double media(int a, int b){
    return (a+b)/2.0;
  }
  public static double media(int a, int b, int c){
    return (a + b + c)/3.0;
  }
}
```



