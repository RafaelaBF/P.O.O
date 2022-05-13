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

## Declaração de condições e loop

```java
int k = 0
if(k < 10){
  System.out.println()
}

//for loop

for (int i = 0; i < 10; i++){
  System.out.println("rodada" + i)
}

//while

int j = 0;
while (j<10) {
  j++;
}

//do while

int g = 0;
do {
  i++;
} while (g<10);
```

### Diferença entre `++i` e `i++`

- Pré-incrementar:
> Primeiro incrementa a variável, e depois atribui o valor(caso ele seja atribuido à uma variável).

```java
int i = 5;
int x = ++i;

System.out.println(i);
System.out.println(x);
```
> Output: 6 <br>
> Output: 6

- Pós-incrementar:
> Primeiro atribui o valor(caso ele seja atribuido à uma variável), e depois incrementa a variável.


```java
int i = 5;
int x = i++;

System.out.println(i);
System.out.println(x);
```
> Output: 6 <br>
> Output: 5

## Input do console em Java

Para receber inputs do terminal em java, é necessário utilizar a biblioteca Scanner. 

### Como utilizar

- Primeiro, importe a biblioteca:

> import java.util.Scanner;

- Segundo, crie uma instância do objeto Scanner.

```java
import java.util.Scanner;
package programa3;

public class Aula3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  }
}
```

- Terceiro, utilize os métodos da classe para puxar um tipo específico:

```java
import java.util.Scanner;
package programa3;

public class Aula3 {
  public static void main(String[] args){
    System.out.println("Insira seu nome: ");
    Scanner sc = new Scanner(System.in);
    String linha = sc.nextLine();
    System.out.println("Insira a idade: ");
    int lerInteiro = sc.nextInt();
    System.out.println("Seu nome é: " + linha + ", e sua idade é: " + lerInteiro);
  }
}
```
