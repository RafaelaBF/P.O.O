# Aula 12

Na ultima aula vimos algums metodos de ArrayList, como:
- contains
- removeAll
- add
- indexOf
- e outros

Vimos também os seguintes métodos:
- equals
- toString

E agora, vamos ver o **toCharArray**.


# toCharArray

Em alguns exercicios, podemos encontrar um pedido para fazer algo com caracteres da string, e inverter a string

> ex: substituir A por @, E por #, etc

Para isso, utilizamos o método **toCharArray**, pois ele transforma a String em um **array de chars**, e desta forma podemos olhar cada caractere **individualmente**.


```java
String a = "A casa é bonita";
char x[] = a.toCharArray();
```
> isso transforma a String 'a' em um array de chars, onde x está apontando para este array.

> Exercício: InverteString.java

```java
package toCharArray;

public class Main {

	public static void main(String[] args) {
		String a = "A casa é bonita";
		System.out.println(inverteString(a));
	}
	public static String inverteString(String a) {
		char x[] = a.toCharArray();     //transforma a string passada em toCharArray
		String b = "";                  //cria uma String vazia para concatenar os valores
		for(int i = x.length-1; i >= 0; i--) {
			b+=x[i];                      //indo do final da string ate o inicio, e concatenando os valores
		}
		return b;                       //retorna a função
	}

}
```

Neste exercício, além de inverter a String, ele troca os valores a, e, i e o, por 4, 3, 1 e 0.

> Exercício: InverteTrocaString.java

```
package toCharArray;

public class Main {

	public static void main(String[] args) {
		String a = "A casa é bonita";
		System.out.println(criptografaString(a));
	}
	public static String criptografaString(String a) {
		a = a.toLowerCase();
		char x[] = a.toCharArray();
		String b = "";
		for(int i = x.length-1; i >= 0; i--) {
			if(x[i] == 'a') x[i] = '4';
			if(x[i] == 'e') x[i] = '3';
			if(x[i] == 'i') x[i] = '1';
			if(x[i] == 'o') x[i] = '0';
			b+=x[i];
		}
		return b;
	}
}
```

# Método .split

VAI CAIR NA PROVA 2!!!!!!!!!

O método split tem a função de dividir uma String a partir de um delimitador, e retorna um vetor com os elementos recebidos.

> ex.:

```java
String k = "A casa é bonita";
String m[] = k.split(" ");
//vetor		     //delimitador
```

Isto retorna um array que contém os valores:
- m[0] = "A";
- m[1] = "casa";
- m[2] = "é";
- m[3] = "bonita";

! IMPORTANTE ! - O delimitador do split não se limita a caracteres.

```java
String k = "A casa é bonita";
String m[] = k.split("ca");
//vetor		     //delimitador
```
- m[0] = "A ";
- m[1] = "sa é bonita";



# Método trim

O método trim retorna uma nova string, removendo os espaços no início e no final da string.

ex.:

```java
String n = "    A bola    ";
n = n.trim();
System.out.println(n);
```

> Output: "A bola"

# Método toUpperCase() e toLowerCase()

## toUpperCase()

```java
String n = "A bola";
n = n.toUpperCase();
System.out.println(n);
```

> Output: "A BOLA"

## toLowerCase()

```java
String n = "A bola";
n = n.toLowerCase();
System.out.println(n);
```

> Output: "a bola"

# Diferença entre Conjunto e Lista

Nas listas, garantirmos que a ordem seja respeitada.

Porém, no conjunto não. Essa é sua característica principal.

ex.:

```java
	HashSet m = new HashSet();
	m.add("casa");
	m.add("bola");
	m.add("mesa");
	m.add("cama");
	System.out.println(m);
```

> Output: casa, mesa, bola, cama

Nos conjuntos, não são aceitos elementos repetidos.

ex.:

```java
	HashSet m = new HashSet();
	m.add("casa");
	m.add("bola");
	m.add("mesa");
	m.add("cama");
	m.add("cama");
	System.out.println(m);
```

# Exercicio de HashSet

Fazer media de caracteres das strings dentro de uma hashset

## Com advanced for

```java
package toCharArray;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		HashSet<String> m = new HashSet<String>();
		m.add("casa");
		m.add("bola");
		m.add("mesa");
		m.add("cama");
		m.add("arvore");
		System.out.println(mediaHashSet(m));
	}
	public static double mediaHashSet(HashSet<String> hash) {
		double media = 0.0;
		double div = hash.size();
		for(String element : hash) {
			media += element.length();
		}
		return media/div;
	}
}
```

## Com Iterator

O Iterator permite que a gente possa acessar todos os objetos de uma estrutura que definirmos que ele exista.

Ou seja, caso eu defina um iterator em uma ArrayList, ele poderá acessar todos os elementos da ArrayList, e isso serve para HashSet, List, Collection, etc.

```java
package toCharArray;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		HashSet<String> m = new HashSet<String>();
		m.add("casa");
		m.add("bola");
		m.add("mesa");
		m.add("cama");
		m.add("arvore");
		System.out.println(mediaHashSet(m));
	}
	public static double mediaHashSet(HashSet<String> hash) {
		Iterator<String> it = hash.iterator();
		double media = 0.0;
		double div = hash.size();
		while(it.hasNext()) {			//boolean pra saber se há um proximo elemento no endereço de memoria que o iterator está apontando
			media += it.next().length();	//it.next() retorna o proximo elemento que ele está olhando, e como aqui ele já estava olhando para o "inicio" da hashset, ele pega o primeiro elemento
		}
		return media/div;
	}
}
```


# oqq ele vai colocar agr

# Anotações soltas

nao sei oq contextualizar disso aq, mas ta aq

`Luiz Carlos#1000.70`
`Ana Maria#1357.30`

```java
ArrayList x = Utils.getFuncionario();
String u = (String) x.get(0);
String k[] = u.split("#");
double val = Double.parseDouble(k[1]);
```


toda Collection tem acesso a um Iterator.







