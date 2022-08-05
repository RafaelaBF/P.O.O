package interfc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("080");
		ArrayList<Object> x = new ArrayList<Object>();
		x.add(p);
		System.out.println(x);
		x.add(new Pessoa("444"));
		System.out.println(x);
		System.out.println(x.contains(new Pessoa("080")));
		System.out.println(x.contains("080"));
		//aqui, ele compara implicitamente com o .equals os objetos,
		//e como o endereço da memoria de cada objeto instanciado é diferente, ele não vai retornar true de primeira													
		//o equals da classe object, ele compara os objetos com ==, então caso o endereço da memória não seja igual
		//ele sempre vai retornar false
		//para a gente resolver isso, precisamos sobrescrever o método equals na classe Pessoa.
		//olhar arquivo Pessoa.java
		//varios metodos da arraylist utilizam o .equals para fazer suas comparações, como o .remove, .contains, .indexOf, etc.
		//então para fazermos essas comparações em tipos especificos, é necessário fazer essa sobrescrita.
		ArrayList<Object> y = new ArrayList<Object>();
		y.add(new String("080"));
		y.add(new String("444"));
		System.out.println(y.contains(new String("080")));
	}

}
