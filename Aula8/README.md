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

A quantidade de sobrecargas não tem restrição. Porém, deve-se ter cuidado com as assinaturas passadas, pois não pode ter duas assinaturas iguais.

```java
public Animal (String cor){
}
public Animal (String nome){
}
public Animal (int idade, String nome){
}
```

O exemplo acima demonstra o problema, pois ao instanciar `new Animal("Totó")`, o java não saberá em qual colocar, ou no nome ou na cor.

# Exemplo bagulho de prova


# Anotações envolvendo o Super

* O super é uma forma de acessar a classe _acima_ da que ta sendo chamada.

* O objetivo do Super é exatamente _construir_ toda a estrutura da memoria feita pelos _construtores_ para aí sim criar o objeto de acordo com a hierarquia das superclasses.

* o super() é uma chamada ao construtor, porem ele tbm pode ser chamado como um metodo

* super.comer(); dessa forma, ele chama o comer() da classe acima de qual foi chamada.

* no entanto, em qualquer lugar de uma subclasse, é possivel chamar o super como um metodo

* todo construtor tem uma chamada ao super implicitamente

* se vc chamar o super, ele vai chamar explicitamente

* a chamada ao super é uma chamada ao construtor da superclasse

* ou seja, o super da classe leao chama o construtor da classe animal, mas se ela tem parametros no construtor é necessário passar no super os atributos tbm.

* o super é na maioria das vezes a primeira linha dentro do construtor, porque voce precisa primeiro criar a estrutura toda na memória, para aí sim settar o nome, peso e etc.

* porem, na primeira linha de um construtor SEMPRE deve ter uma chamada a algum construtor, seja essa chamada implicita ou explicita. também nao se restringe ao `this` ou o `super`


```java
public class Animal {
  public Animal (String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
}

public class Leao extends Animal {
  private double tamanhoJuba;
  public Leao (String nome, int idade, double tamanhoJuba){
    super(this.nome, this.idade); //exemplo da primeira linha sendo uma chamada a um construtor
    this.tamanhoJuba = tamanhoJuba;
    super.comer();
  }
}
```

# Anotações sobre o This

Quando o _this_ é chamado como um metodo, ele pode chamar outros construtores dentro da propria classe.

```java
public Animal (String nome, int idade){
  this.nome = nome;
  this.idade = idade;
}
public Animal (String nome){
  this(nome, 0); //this chamando o construtor da propria classe, colocando um valor padrão para a idade do animal caso a mesma não seja especificada.
}

```

# Método .toString()

Ao tentar printar uma variavel que aponta para um objeto, ele teoricamente printaria:

> nome_da_classe + @ + hashcode

Porém, o java chama o metodo .toString() implicitamente. E como o método .toString() é um metodo da classe String, é possível sobrescrever ela em outras classes.

# Exercicio de sobrescrita do método .toString()

> Arquivo: Estrela.java

```java
package exercicio;

public class Estrela {
	private String id;
	private double raio;
	
	public Estrela(String id, double raio) {
		this.id = id;
		this.raio = raio;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public String toString() {
		return "Id: " + this.id + "\nRaio: " + this.raio;
	}
	
}

```

> Arquivo: Main.java

```java
package exercicio;

public class Main {
	
	public static void main(String[] args) {
		Estrela est1 = new Estrela("Sol", 123);
		Estrela est2 = new Estrela("Sirius", 456);
		System.out.println(est1);
		System.out.println(est2);
	}

}
```

> Console

```txt
Id: Sol
Raio: 123.0
Id: Sirius
Raio: 456.0
```

# Packages

Para fazer uma melhor organização das classes, e permitir a criação de duas classes com mesmo nome porém com focos diferentes, utilizamos os packages.

> Ex.:

```txt
br.com.abc.informatica -> Teclado.class
br.com.abc.instrumentos -> Teclado.class
br.com.abc.principais -> Principal.class
```

Eles permitem que a gente restrinja quais classes tem acesso a quais classes, dependendo de quais _imports_ nós colocamos.

> Ex.:

```txt
package br.com.abc.principais;
import br.com.abc.informatica.Teclado;
```


## No eclipse

> Botão direito > New > Package (parece a logo do windows)




## Nome totalmente qualificado da classe

O nome da classe é o nome do pacote mais o nome da classe

dessa forma, da pra importar duas classes de nomes iguais de classes diferentes

```java
package br.com.abc.principais;
import br.com.abc.informatica.Teclado;
import br.com.abc.instrumento.Teclado;
public class Principal {
	public static void main(String[] args){
		Teclado tec1 = new Teclado();
		Teclado tec2 = new Teclado();
	}
}
```

## dica

tem varias bibliotecas de classe no seguinte site: commons.apache.org

