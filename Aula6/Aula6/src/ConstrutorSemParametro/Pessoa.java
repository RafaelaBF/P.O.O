package ConstrutorSemParametro;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() { // Isso é um contrutor sem parametro -> Java Bin
		System.out.println("Esse é o construtor, toda fez que chamar pessoa, cai aqui!");
		
	}

	/*
	public void Pessoa() { Isso é um metodo
		Se for colocado qualquer coisa diferente que public Pessoa(), como void, é método.
	}
    */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		// O this é uma forma de diferenciar as variavel, o this está se referindo ao objeto.
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
