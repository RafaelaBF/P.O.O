package Program;
import Program.Cao;
import Program.Cachorro;;

public class Programa {
	
	public static void main(String[] args) {
		System.out.println("Que a força esteja com vc!!"); // Printa na tela
		System.out.println("Tamanho do argumento: " + args.length); // Para imprimir na tela o tamanho da array "args"
		System.out.println("Primeiro argumento: " + args[0]); // Printar um Exception se não há nada em "args", se tiver sai o primeiro parameto.
	
		Cao caoObj1 = new Cao(); // Cria um objeto cao vazio.
		// Popula o objeto cão 1 
		caoObj1.tamanho = 20.4f; // Para declarar um Float precisa colocar io f no final
		caoObj1.nome = "Cão 1";
		caoObj1.raca = "Vira Lata";
		System.out.println("Cão 1: "+ caoObj1.nome + " "+ caoObj1.tamanho + " "+ caoObj1.raca); // Printar Atributos do cão 1
		
		Cao caoObj2 = new Cao(); // Cria um objeto cao vazio.
		// Popula o objeto cão 2
		caoObj2.tamanho = 34.4f;
		caoObj2.nome = "Cão 2";
		System.out.println("Cão 2: "+ caoObj2.nome + " "+ caoObj2.tamanho + " "+ caoObj2.raca); // Printar Atributos do cão 2
	
		Cachorro caoObj3 = new Cachorro(53.4f, "Cão 3", "Marques"); // Class com contrutor
		System.out.println("Cão 3: "+ caoObj3.nome + " "+ caoObj3.tamanho + " "+ caoObj3.raca); // Printar Atributos do cão 3
		
		Cao caoLatir = new Cao(); // Chamar um metodo de um objeto
		caoLatir.nome = "Cão Latido";
		caoLatir.latir();	
	}
}
