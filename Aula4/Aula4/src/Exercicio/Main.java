package Exercicio;

public class Main {
	public static void main(String[] args) { 
		
		Aluno []alu = new Aluno [3]; // Declarando Array
		alu[0] = new Aluno("Burgues", 9.8); // Populando o Array
		alu[1] = new Aluno("Rafa", 9.5);
		alu[2] = new Aluno("Eric", 10.0);
		
		System.out.println(mediaNota(alu)); // Chamando o metodo e printando o return.
		
	}
	
	public static double mediaNota(Aluno[] arrayAluno) { // Metodo para fazer a media das notas
		double soma = 0;
		for (int i = 0; i < arrayAluno.length; i++) {
			soma += arrayAluno[i].nota;
		}
		
		return soma/arrayAluno.length;
	}
}
