package exceptions;

public class Resolvido0Problema1 {
	public static void main(String[] args) {
		System.out.println("Inicio so ain");
		try {
			metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error:" + e);
		}
		System.out.println("Fim do  main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fim metodo 1");
	}
	
	public static void metodo2() {
		System.out.println("Inicio metodo 2");
		int [] array = new int[10];
		
		for(int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
	
		System.out.println("Fim metodo 2");
	}
}
