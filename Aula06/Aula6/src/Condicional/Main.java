package Condicional;

public class Main {
	
	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		
		/*
		 | || --> Ou
		 
		 & && --> E
		*/
		
		if (a & b) { // Se o 'a' for 'false' mesmo assim ele vai checar o 'b'. 
			System.out.println("E");
		}
		
		if (a && b) { // O 'a' for falso ele já para de checar.
			System.out.println("E");
		}
		
		if (a | b) { // Se o 'a' for 'true' mesmo assim ele vai checar o 'b'.
			System.out.println("Ou");
		}
		
		if (a || b) { // O 'a' for true ele já para de checar.
			System.out.println("Ou");
		}
		
		System.out.println("Fim");
	}
}
