package ConstrutorComParametro;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	
	public Pessoa(String nome, String cpf) { // Isso é um contrutor com parametro
		setNome(nome);
		this.cpf = cpf; // Pode ser subtituido pelo set pois já que eu só vou passar esse metodo uma vez.
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
