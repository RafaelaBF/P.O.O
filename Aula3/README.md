# Aula 3

## Variáveis

- Existem dois tipos de variáveis: **primitivas** e de **referência**.
- O Java considera o tipo importante. Ele não permitirá que o programador faça algo bizarro e perigoso, como inserir a **referência** a um objeto Girafa dentro de uma **variável** Coelho.

```java
package programa3;

public class Aula3 {
  Coelho saltador = new Girafa();
}
```
> Não compila, pois a variável do tipo Coelho não pode instanciar um tipo Girafa.

```java
package programa3;

public class Aula3 {
  Girafa grandona = new Girafa();
}
```
> Compila, pois a variável do tipo Girafa pode instanciar um tipo Girafa.

---

## Sintaxe básica de uma classe Java

---

```java
[modificadores] class <nome_da_classe> {
  [declaração de atributos]
  [declaração de construtores]
  [declaração de métodos]
}
```
Exemplo:
```java
public class Veiculo {
  private double cargaMaxima;
  public void setMaxLoad(double value){
    cargaMaxima=value;
  }
}
```

## Comentários

Existe duas formas de comentar o código em Java:

- Por Linha
- Por Bloco

```java
package programa3;

public class Aula3 {
  // Isso é um comentário de linha
  
  /*
   * Isso é um comentário de bloco
   */
}
```

## Casting

> OBS.: Olhar slide pra anotar melhor

Casting é basicamente dizer para o programa que um tipo de variável DEVE ser aquele tipo, e essa é a decisão do programador.

Exemplo:

```java
package programa3;

public class Aula3 {
  public static void main(String[] args){
    short a = 1000;
    byte c = (byte) a; //Compila, porém byte só aguenta até 128, então ele retorna um número "aleatório"
  }
}
```

> OBS.: Em quaisquer somas de números "inteiros", o compilador Java os transforma para **int**, então em uma soma de bytes, é necessário fazer o casting.
