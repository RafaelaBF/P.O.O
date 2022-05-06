package Program;
import Program.Cao;
import Program.Cachorro;;

public class Programa {
	
	public static void main(String[] args) {
		System.out.println("Que a for�a esteja com vc!!"); // Printa na tela
		System.out.println("Tamanho do argumento: " + args.length); // Para imprimir na tela o tamanho da array "args"
		System.out.println("Primeiro argumento: " + args[0]); // Printar um Exception se n�o h� nada em "args", se tiver sai o primeiro parameto.
	
		Cao caoObj1 = new Cao(); // Cria um objeto cao vazio.
		// Popula o objeto c�o 1 
		caoObj1.tamanho = 20.4f; // Para declarar um Float precisa colocar io f no final
		caoObj1.nome = "C�o 1";
		caoObj1.raca = "Vira Lata";
		System.out.println("C�o 1: "+ caoObj1.nome + " "+ caoObj1.tamanho + " "+ caoObj1.raca); // Printar Atributos do c�o 1
		
		Cao caoObj2 = new Cao(); // Cria um objeto cao vazio.
		// Popula o objeto c�o 2
		caoObj2.tamanho = 34.4f;
		caoObj2.nome = "C�o 2";
		System.out.println("C�o 2: "+ caoObj2.nome + " "+ caoObj2.tamanho + " "+ caoObj2.raca); // Printar Atributos do c�o 2
	
		Cachorro caoObj3 = new Cachorro(53.4f, "C�o 3", "Marques"); // Class com contrutor
		System.out.println("C�o 3: "+ caoObj3.nome + " "+ caoObj3.tamanho + " "+ caoObj3.raca); // Printar Atributos do c�o 3
		
		Cao caoLatir = new Cao(); // Chamar um metodo de um objeto
		caoLatir.nome = "C�o Latido";
		caoLatir.latir();	
	}
}
