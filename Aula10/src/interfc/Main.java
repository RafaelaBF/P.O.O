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
		//e como o endere�o da memoria de cada objeto instanciado � diferente, ele n�o vai retornar true de primeira													
		//o equals da classe object, ele compara os objetos com ==, ent�o caso o endere�o da mem�ria n�o seja igual
		//ele sempre vai retornar false
		//para a gente resolver isso, precisamos sobrescrever o m�todo equals na classe Pessoa.
		//olhar arquivo Pessoa.java
		//varios metodos da arraylist utilizam o .equals para fazer suas compara��es, como o .remove, .contains, .indexOf, etc.
		//ent�o para fazermos essas compara��es em tipos especificos, � necess�rio fazer essa sobrescrita.
		ArrayList<Object> y = new ArrayList<Object>();
		y.add(new String("080"));
		y.add(new String("444"));
		System.out.println(y.contains(new String("080")));
	}

}
