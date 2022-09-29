# Aula 13

# Recaptulando a aula passada

Collection <-- List <-- ArrayList

Collection <-- Set <-- HashSet
Map <-- HashMap


```java
metodoX(Collection c) {};

ArrayList k = new ArrayList();
HashMap m = new ArrayList();
metodoX(k); //compila
metodoX(m); //nao compila
```

# HashMap

O HashMap consiste de uma estrutura que trabalha com uma **Chave Única**, e um **Valor** atribuido a esta chave.
|Chave|Valor|
|-----|-----|
|"080974"|\*obj1_classe_Pessoa|
|"abc"|\*obj2_classe_Pessoa|
|"xxx"|\*obj2_classe_Pessoa|
|"Abcd"|\*obj3_classe_Pessoa|

Neste caso, as chaves estão associadas a ponteiros de objetos de classes **Object**.

## Criando um HashMap:

`HashMap m = new HashMap();`

## Exemplo de utilização do HashMap

```java
HashMap m = new HashMap();
m.put("abc", new Pessoa());
Pessoa p = new Pessoa();
p.setNome("EEEE");
m.put("f", p);
m.put("g", p);
```

## Método get no HashMap

Ao utilizar o .get(chave) no HashMap, o valor retornado sempre será Object, então é necessário fazer o Casting para o valor desejado.

```
HashMap m = new HashMap();
m.put("aa", new Pessoa());
Pessoa ps = (Pessoa)m.get("aa");
```

> Obs.: Caso o .get não ache um valor para a chave passada, ele retorna `Null`

## Exercício da Aula

> Crie um mapa em que a chave representa o nome dos alunos e o valor a idade. Em seguida, invoque um método que retorne a média das idades dos alunos.

## Utilizando os valores do HashMap

```java
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		int quant = sc.nextInt();
		System.out.println(quant);
		sc.nextLine();
		for(int i = 0; i < quant; i++) {
			String nome = sc.nextLine();
			System.out.println(nome);
			int idade = sc.nextInt();
			System.out.println(idade);
			sc.nextLine();
			m.put(nome, idade);
		}
		System.out.println(m);
		System.out.println(mediaHash(m));
		
		sc.close();
	}
	
	public static double mediaHash(HashMap<String, Integer> m) {
		double media = 0;
		Collection<Integer> c = m.values();
		Iterator<Integer> iter = c.iterator();
		while(iter.hasNext()) {
			media += (int)iter.next();
		}
		return media/m.size();
	}
}

```

## Utilizando o keySet()

```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		int quant = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < quant; i++) {
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			sc.nextLine();
			m.put(nome, idade);
		}
		System.out.println(m);
		System.out.println(mediaHash(m));
		
		sc.close();
	}
	
	public static double mediaHash(HashMap<String, Integer> m) {
		double media = 0;
		Set<String> c = m.keySet();
		Iterator<String> iter = c.iterator();
		while(iter.hasNext()) {
			media += m.get((String)iter.next());
		}
		return media/m.values().size();
	}
}
```

## Percorrendo os valores do HashMap sem generics

```java
public class Main {
	
	public static double media(HashMap m) { // recebe como parâmetro apenas o mapa
		double media = 0;
		int soma = 0 ;
		
		
		// Para percorrer uma collection é preciso do iterator
		
		Collection idades = m.values(); // o método .values() retorna uma collection com todos os valores do mapa sem suas chaves
		
		// O uso de .values() é necessário, pois para percorrer o mapa acessando seus valores, seria necessário saber as chaves de cada valor
		 
		
		Iterator<Integer> it = idades.iterator(); 
		
		while(it.hasNext()) {
			soma += (int) it.next();
			
		}
		
		media = soma/idades.size();
			
		
		return media;
	}
	
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap(); // criando o mapa sem generics
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {                  
			// lendo os nomes dos alunos e suas idades
			
			String nome;
			nome = sc.nextLine();
			int idade;
			idade = sc.nextInt();
			sc.nextLine();
			map.put(nome, idade); // colocando os dados coletados no mapa, sendo o nome a chave e a idade o valor
		}
		
		System.out.println("A média das idades dos alunos é " + media(map)); // retornando a médias das idades na tela
		
	}
}



```

# Coisas que irão cair na prova (Segundo Trimestre)

- sobrescrita de .equals
- prestar atenção no super() das subclasses
- sobrescrita de .toString() na classe mãe
- sobrescrita de .toString() nas classes filhas (super.toString())
- herança, construtores
- Collection, Set, Iterator, Map, ArrayList
- .toCharArray(), .toUpperCase(), .split()
