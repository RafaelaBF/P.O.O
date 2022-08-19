package exercicioDeRevisao;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		int qtd = 1;
		Scanner sc = new Scanner(System.in);
		Utils ut = new Utils();
		ArrayList<String> listaAlunos = new ArrayList<String>();
		
		for (int i = 0; i <= qtd; i++) {
			System.out.println("Escreva o id: ");
			String id = sc.nextLine();
			System.out.println("Escreva o nome: ");
			String nome = sc.nextLine();
			System.out.println("Escreva o nota: ");
			String nota = sc.nextLine();
			System.out.println("Escreva o  tipo do aluno: ");
			String tipoAluno = sc.nextLine();
			
			String aluno = i + "#" + nome + "#" + nota + "#" + tipoAluno;
			listaAlunos.add(aluno);
		}
		
		Aluno[] alunos = ut.retornaDados(listaAlunos);
		sortAluno(alunos);
		for(int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
		
	}
	
	private static void swapAluno(Aluno[] arr, int i, int j) {
		if (i != j) {
			Aluno aux = arr[i];
			arr[i] = arr[j];
			arr[j] = aux;
		}
	}
	
	public static void sortAluno(Aluno[] aluno) {
		for(int i = 0; i < aluno.length - 1; i++) {
			int minNum = i;
			for(int j = i + 1; j < aluno.length; j++) {
				if(aluno[j].getNome().compareTo(aluno[minNum].getNome()) < 0) {
					minNum = j;
				}
			}
			swapAluno(aluno, minNum, i);
		}
	}

}
