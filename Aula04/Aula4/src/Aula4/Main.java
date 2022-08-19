package Aula4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int [] x = new int [3]; // Declarando o Array e seu tipo, no caso int; [3] Declara quantos espaços tem no Array.
		int soma = 0;
		
		x[0] = 13; // Populando o Array.
		x[2] = 7;
		
		for (int i = 0; i < x.length; i++) { // Somando todos os valores do Array e colocando na variavel e Printando o Array.
			soma += x[i];
			System.out.println("X[" + i + "]: " + x[i]);
		}
		
		System.out.println("Soma: " + soma);
		
		
		Cachorro [] y = new Cachorro [3]; // Array de classe. 
		y[0] = new Cachorro("AUAU", 11);
		y[1] = new Cachorro("LULU", 10);
		y[2] = new Cachorro("TOTO", 5);
		
		for (int i = 0; i < y.length; i++) { // Printando o Array.
			System.out.print("Y[" + i + "]: " + y[i].nome); // Printando na mesma linha
			System.out.println(" Y[" + i + "]: " + y[i].idade);
		}
		
		String [] u = new String [4]; // Array de String.
		u[2] = "abcd";
		u[3]= "AAAA";
		
		for (int i = 0; i < u.length; i++) { // Printando o Array.
			System.out.println("U[" + i + "]: " + u[i]);
		}
		
		// Scanner em um Array
		int [] w = new int [3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < w.length; i++) {
			System.out.println("Insira um número: ");
			x[i] = sc.nextInt();
		}
	}
	
	// Aumentar Array
	public static Cachorro[] aumentaArraySePreciso (Cachorro [] x) {

		Cachorro y []= new Cachorro [5];
		x[0] = new Cachorro("AAAA", 40);
		x[1] = new Cachorro();
		
		for(int i = 0; i < x.length; i++) {
			y[i] = x[i];
		}
		return null;
	}
}
