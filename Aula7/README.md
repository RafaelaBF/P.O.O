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

Para que as classes filhas possam acessar os atributos da classe mãe, já que os mesmos são privados, é necessário a utilização dos getters e setters para trabalhar com eles.

> Arquivo: Leao.java

```java
public class Leao extends Animal{
	public void rugir() {
		System.out.println("Leao " + this.getNome() + " rugiu.");
	}
}
```

## Polimorfismo

O tipo do objeto instanciado em memoria, q a gente deu o New, ele nao vai mudar nunca. ele foi instanciado cmomo leao ele vai ser leao.
oq muda e a forma como a gente olha pro objeto

a gente pode olhar pro leao como um animal
como um objeto

por isso polimorfismo



É possível instanciar um objeto pela sua classe mãe, porém isso não significa que ele tenha acesso a 

**o professor falou muita coisa ao msm tempo de polimorfismo, sobrescrita e herança, e nao deu pra pegar os codigo e o readme ao msm tempo**
**tem mais algumas anotacoes nos codigos**
