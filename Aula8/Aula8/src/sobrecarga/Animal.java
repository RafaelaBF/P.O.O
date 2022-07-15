package sobrecarga;

public class Animal { // Sobrecarga de método
	private String nome;
	private int idade;
	private float peso;
	
	public Animal(String nome, int idade, float peso) { // Construtor com todas os atributos. (Construtor 1)
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
//  Não vai funcionar pq se fazemos não podem ter o msm tipo na msm ordem.	
//	public Animal(String cao, int id, float p) { 
//		this.nome = cao;
//		this.idade = id;
//		this.peso = p;
//	}

	public Animal(String nome, int idade) { // Construtor com todas apenas dois atributos. (Construtor 2)
		this.nome = nome;
		this.idade = idade;
	}

	public Animal(String nome, float peso) { // Construtor com todas apenas outros dois atributos. (Construtor 3)
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public float getPeso() {
		return peso;
	}	
}
