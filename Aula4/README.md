# Aula 4

## Arrays

- Os arrays em java são basicamente listas de um **tipo** especifico.

- Para criá-las, é necessário instanciar um array declarando qual é o seu **tipo**, e quantos **elementos** ele vai comportar.

```java
package programa4;

public class Aula4 {
  public static void main(String[] args){
    int [] x = new int [3]; //instanciando um array de tipo int com 3 elementos
  }
}
```

> OBS.: No momento que o array é criado, cada posição designada é definida como NULL, ou seja, não possui nada naqueles espaços. Porém esses espaços podem comportar somente os tipos que foram declarados.

## Atribuição de valores em Arrays

- Para atribuir valores à um array, é preciso designar um valor do tipo do array a uma posição do mesmo.

```java
package programa4;

public class Aula4 {
  public static void main(String[] args){
    Cachorro [] y = new Cachorro[3];
    y[0] = new Cachorro();
    y[0].nome = "Bidu";
  }
}
```

> Foi instanciado um novo **objeto do tipo Cachorro** na **posição 0** do array de **tipo Cachorro**

## Exercício

1. Crie a classe aluno.
2. Crie um array com 3 posições que podem receber alunos.
3. Popule o array com 3 alunos.
4. Atribua nome e nota aos alunos (sem usar scanner).
5. Crie um novo método que recebe um array de alunos. Esse metodo deve retornar a média das notas dos alunos.
