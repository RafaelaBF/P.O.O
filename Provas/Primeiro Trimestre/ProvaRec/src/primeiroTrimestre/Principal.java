package primeiroTrimestre;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		AgenciaDeCarros agencia = new AgenciaDeCarros();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 101; i++) {
			String placa = sc.nextLine();
			String marca  = sc.nextLine();
			String modelo  = sc.nextLine();
			double preco  = sc.nextDouble();
			
			Carro c = new Carro (placa, marca, modelo, preco);
			if(!agencia.inserirCarros(c)) {
				System.out.println("Agência está cheia");
			}
		}
		System.out.println(agencia.getArrayCarros());
	}
	
	public double calcularMedia(Carro[] c) {
		double media = 0;
		for(int i =0; i < c.length; i++) {
			media += c[i].getPreco();
		}
		return (media/c.length);
	}
	
	public double precoPorMarca(Carro[] c, String s) {
		double soma = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i].getMarca().equals(s)) {
				soma += c[i].getPreco();
			}
		}
		return soma;
	}
}
