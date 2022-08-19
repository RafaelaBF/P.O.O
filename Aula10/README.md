# Aula 10

OBS.: Tem bastante coisa importante comentada dentro dos códigos dessa aula, então da uma checada ;)

## ArrayList

Sabemos que podemos criar arrays normais das seguintes formas:

```java
int [] x = new int[5];
``` 

ou

```java
x = {1,2,3,4,5};
```

Nesses casos, nunca vamos conseguir aumentar ou diminuir o tamanho dos arrays instanciados, pois uma vez criados eles não mudam de tamanho alocado na memória.

É aí que entram as **ArrayLists**.

As arraylists são uma classe interna. Ela é uma lista que utiliza um array, e pode adicionar elementos até acabar a memória.

Pra utilizar as ArrayLists, é necessário importar da biblioteca java.util.

`import java.util.ArrayList;`

ARRAYLIST NÃO TEM LENGTH, SOMENTE SIZE

```java
public static void main(String[] args) {
  ArrayList<?> x = new ArrayList<Object>();
  x.add("abc");
  x.add("def");
  x.add("ghi");
  x.add("jkl");
  x.add("mno");
  System.out.println(x.size()); //pega o tamanho atual da quantidade de objetos dentro do vetor
  System.out.println(x);        //todos os valores atuais dentro do vetor
  System.out.println(x.get(1)); //pega o valor no index 1 da arraylist
  System.out.println(x.contains("abc")); //retorna um boolean para caso a arraylist contenha um certo item dentro
  x.set(3, "aaa");              //substitui o item na lista do indice 3, com o objeto "aaa"
  x.remove("ghi");
}
```

É possível adicionar **QUALQUER TIPO DE OBJETO** dentro dela. É basicamente uma lista de objetos.

```java
ArrayList<?> y = new ArrayList<Object>();
y.add(10);              
y.add("casa");
y.add(new ArrayList());
```

Exemplo:

> Arquivo Main.java

```java
public class Main {
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		arr.add("ddd");
		arr.add("ddd");
		arr.add("eee");
		System.out.println(arr);
		arr.set(0, "zzz");
		System.out.println(arr);
		arr.remove("ccc");      //remove a primeira instancia do argumento passado (caso tenha dois, remove o primeiro que aparece de cima pra baixo)
    //para remover varias instancias de um objeto de uma vez só, é necessário criar uma arraylist contendo somente aquele objeto
    //e utilizar o arrPrincipal.removeAll(arrNovo); 
		System.out.println(arr);
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr2.add("eee");
		arr2.add("ddd");
		arr.removeAll(arr2);    //remove os valores da arr2 contidos em arr
		System.out.println(arr);
	}
  
	public static double tamanhoMedioStrings(ArrayList<Object> x) {
		double media = 0.0;
		for(int i = 0; i < x.size(); i++) {     //utiliza o size para iterar
			Object o = x.get(i);                  //coloca o item em uma variavel objeto
      String y = (String) o;                //como a classe ArrayList não é uma subclasse de String, é necessário fazer o Casting
			media += y.length();                  //para utilizar os métodos da classe String.
		}
		return media/x.size();
	}
}
```

A ArrayList é uma implementação de List, asism como a EuList e a LinkedList.

Ou seja, List é a interface (ele falou mais alguma coisa sobre list ser uma Collection)

```java
main {
  List x = new ArrayList();
  Collection y = new ArrayList();
}
```

## Remove

o .remove tem duas formas de retornar.

remove pelo indice
remove pelo object

```java
ArrayList<Object> arr = new ArrayList<Object>();
arr.add("aaa");
arr.add("bbb");
arr.remove(1); //retorna o Objeto que foi removido
arr.remove("aaa"); //retorna uma boolean de caso removeu ou não
```

