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


```java
String a = "A casa é bonita";
char x[] = a.toCharArray();
```
> isso transforma a String 'a' em um array de chars, onde x está apontando para este array.

Aqui está um exemplo de como inverter uma String:

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

