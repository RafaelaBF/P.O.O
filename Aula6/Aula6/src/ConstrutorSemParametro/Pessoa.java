package ConstrutorSemParametro;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() { // Isso � um contrutor sem parametro -> Java Bin
		System.out.println("Esse � o construtor, toda fez que chamar pessoa, cai aqui!");
		
	}

	/*
	public void Pessoa() { Isso � um metodo
		Se for colocado qualquer coisa diferente que public Pessoa(), como void, � m�todo.
	}
    */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		// O this � uma forma de diferenciar as variavel, o this est� se referindo ao objeto.
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
