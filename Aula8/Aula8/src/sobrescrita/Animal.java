package sobrescrita;

public class Animal { 
	private String nome;
	private String raca;
	private int idade;
	
	public Animal() {
	}

	public Animal(String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public int getIdade() {
		return idade;
	}

	public void rugir() {
		System.out.println("Eu não faço barulho...");
	}	
}
