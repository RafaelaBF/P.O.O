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













