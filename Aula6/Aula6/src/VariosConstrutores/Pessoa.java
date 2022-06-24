package VariosConstrutores;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	
	public Pessoa() { // Esse é um construtor vazio
	}
	
	public Pessoa(String nome, String cpf) { // Esse construtor com parametro
		setNome(nome);
		this.cpf = cpf; 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCpf() {
		return cpf;
	}
}
