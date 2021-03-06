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

### Resolução

> Arquivo: Aluno.java

```java
public class Aluno {
	String nome;
	double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
}
```

> Arquivo: Main.java

```java
public class Main {
	public static void main(String[] args) {
		
		Aluno[] alunos = new Aluno[3];
		
		alunos[0] = new Aluno("Rafaela", 10);
		alunos[1] = new Aluno("Dora", 9);
		alunos[2] = new Aluno("Guilherme", 9.2);
		
		System.out.println(media_alunos(alunos));
		
	}
	public static double media_alunos(Aluno[] array) {
		double soma_media = 0;
		for (int i = 0; i < array.length; i++) {
			soma_media += array[i].nota;
		}
		return soma_media/array.length;
	}
}
```

> OBS.: Para formatar números quebrados (float, double) com precisão decimal, basta utilizar:
`String.format("%2f", valor)`;

## Adicionar mais valores que o limite de um array

- Quando um array é declarado, não é possível adicionar mais valores além do que o limite determinado.
- Para adicionar valores além do limite, é preciso:

1. Criar um novo array com uma capacidade maior.

```java
public static int[] aumentaArray(int[] x){
	int[] x = new int[3];
	int[] y = new int[5];
	x[0] = 3;
	x[1] = 2;
	x[2] = 8;
}
```

2. Copiar os valores do array antigo para o novo.

```java
public static int[] aumentaArray(int[] x){
	int[] x = new int[3];
	int[] y = new int[5];
	x[0] = 3;
	x[1] = 2;
	x[2] = 8;
	
	for(int i = 0; i < x.length; i++){
		y[i] = x[i];
	}
	
	return y;
}
```
