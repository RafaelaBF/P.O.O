package programa3;

import programa3.Cachorro;
import programa3.Girafa;

public class Aula3 {
	// Isso � um coment�rio de linha
	
	/*
	 * Isso � um comet�rio de bloco
	 */
	
	private static int soma = 0;
	
	public static void main(String[] args) {
		//Chamar uma classe
			
		/*  N�o vai compilar
		 *  Cachorro cao = new Girafa(); */
		
		@SuppressWarnings("unused")
		Girafa girafa = new Girafa();
		Cachorro cao = new Cachorro();
		
		cao.nomeCachorro = "consigo acessar";
		// cao.idadeCachorro = 8; N�o vai ser possivel acessar
		
		for (int i = 0; i < 5 ; i++) { // (declara i; con��o para manter no for; soma i a cada itera��o)
			soma = soma + 2;
			System.out.println("soma em for: " + soma);
		}
	
		
		soma = 0; // Fa�a enquanto soma < 5 --> Faz com que pelo menos uma vez ele execute o codigo
		do {
			soma = soma + 3;
			System.out.println("soma em do/while: " + soma);
			
		}while (soma < 5);
		
		int i= 5;
		int x = i++; // Pos-incremento --> primeiro atribui i a x, depois incrementa a i
		System.out.println("i:" + i); // 6
		System.out.println("x:" + x); // 5


		int j= 5;
		int y = ++j; // Pr�-incremento --> primeiro incrementa a j, depois atribui j a y
		System.out.println("j:" + j); // 6 
		System.out.println("y:" + y); // 6

		
		// Exercicios
		
		for (int a = 0; a < 10; a++) {
			if (a == 3) {
				break;
			}
			System.out.println("a: " + a);
		}
		
		int d = 1;
		while(x < 10) {
			@SuppressWarnings("unused")
			int s = d; 
			s++;
		}
	//	System.out.println(s); N�o vai compilar pois est� fora do escopo
	}

}



