package VariosConstrutores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); // O Scanner é um objeto que tem um construtor que recebe. 
		
		Pessoa p1 = new Pessoa(); // --> Isso não dar erro pois há um contrutor vazio;
		
		String nomePessoa = sc.nextLine();
		p1.setNome(nomePessoa);
		
		Pessoa p2 = new Pessoa("Sonia", "483.599.440-08");
		
		p2.setIdade(15);
		
		System.out.println("A idade de "+ p2.getNome() + " eh: " + p2.getIdade());
		
	}
}
