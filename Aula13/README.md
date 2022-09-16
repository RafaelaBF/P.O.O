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
