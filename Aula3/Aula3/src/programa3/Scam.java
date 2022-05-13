package programa3;

import java.util.Scanner;

public class Scam {
	public static void main(String[] args) {
		System.out.println("Insira seu nome: ");
		
		Scanner sc = new Scanner(System.in); // System.in --> Entrada do sistema
		
		String linha = sc.nextLine();
		
		System.out.println("Insira a idade");
		
		int lerInteiro = sc.nextInt();
		
		System.out.println("Seu nome é: " + linha + " Sua idade é: " + lerInteiro);
		
		sc.close();
	}
}
