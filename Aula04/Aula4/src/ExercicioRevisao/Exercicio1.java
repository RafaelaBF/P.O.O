package ExercicioRevisao;

// Ordenar os array Aluno de acordo com a nota do aluno

public class Exercicio1 {
	
	public static void main(String[] args) {
		Aluno [] alu = new Aluno[4];
		alu[0] = new Aluno("Burgues", 9.8); // Populando o Array
		alu[1] = new Aluno("Rafa", 9.5);
		alu[2] = new Aluno("Eric", 10.0);
		alu[3] = new Aluno("Guilherme", 9.7);
		
		Aluno aux = new Aluno(); // Variavel para axiliar a manipulação dos objetos.
	
		for (int i = 0; i < alu.length; i++) { // Ordernar o array
			for (int y = 0; y < alu.length; y++) {
				if (alu[i].nota > alu[y].nota) {
					aux = alu[y];
					alu[y] = alu[i];
					alu[i] = aux;
				}
			}
		}
		for (int i = 0; i < alu.length; i++) { // Printar o Array
			System.out.print(alu[i].nome + ", ");
		}
	}
}
