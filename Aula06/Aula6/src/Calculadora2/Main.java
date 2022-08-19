package Calculadora2;

public class Main {
	
	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora();
		Calculadora calc2 = new Calculadora();
		
		
		calc1.a = 10;
		calc1.b = 13;
		
		calc2.a = 20;
		calc2.b = 23;
		
		System.out.println("A: " + calc1.a + "B: " + calc1.b);
		System.out.println("A: " + calc2.a + "B: " + calc2.b);
		
		// Note que variavel estatica é compartilhada por todos os objetos.
		// Portanto pode ser chamada assim tbm:
		System.out.println("B: " + Calculadora.b);
		
	}
}
