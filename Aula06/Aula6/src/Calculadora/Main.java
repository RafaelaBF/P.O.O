package Calculadora;

public class Main {
	
	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		
		System.out.println(Calculadora.media(5,6)); // Como o metodo é static, não precisa do objeto para instanciar.
		
		System.out.println(Math.random()); // Math é uma classe matematica com varios metodos estaticos.
	}
}
