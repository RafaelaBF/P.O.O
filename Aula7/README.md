# Aula 7

## Herança

Primeiramente, foi criado 4 classes de animais, todas com atributos `privados` *nome*, *idade*, *peso*, e *cor*.
Depois, foi criado em *cada uma* das classes seus getters e setters.

Podemos concordar que cada classe individual possui em torno de 30-35 linhas de código, e cada modificação que a gente quiser adicionar em uma das classes, e colocar nas outras, deverá ser feita manualmente em cada um dos arquivos de código.

Ex.:

Ao adicionar o atributo tamanho em todas, precisamos editar manualmente `private double tamanho;` em todos os arquivos.

> Arquivo: Leao.java

```java
public class Leao {
	private String nome;
	private int idade;
	private double peso;
	private String cor;
	private double tamanho;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
}
```

Para evitar isso, vamos utilizar o conceito de **Herança**, onde vamos criar uma classe **geral** para receber os valores, das "classes filhas".

Foi criado uma classe Animal, que recebe todos os campos anteriormente colocados em cada um dos arquivos.

> Animal.java

```java
public class Animal {
	private String nome;
	private int idade;
	private double peso;
	private String cor;
	private double tamanho;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
}
```

E as outras classes vão ter os mesmos valores "extendidos" dessa "classe mãe".

> Ex.: Leao.java

```java
public class Leao extends Animal{

}
```

Dessa maneira, as classes que "extendem" Animal, possuem todas as características e comportamentos dela, como nome, peso, tamanho, getters e setters, e etc.

> Arquivo: Main.java

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Leao miau = new Leao();
		miau.setNome("Simba");
		System.out.println(miau.getNome());
	}

}
```



