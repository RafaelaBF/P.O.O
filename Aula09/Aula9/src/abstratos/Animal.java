package abstratos;

public abstract class Animal { // Pois ela semprevai ser acessado pelos seus tipos, jamais diretamente.
	private String nome;
	
	public String getNome() { // O metodo não precisa ser abstrato
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Animal() { // POde ser instanciada e se for colocada com super vai sobrescrever / só não pode ser instanciada
		
	}
	
	public abstract void correr(); // Obriga a classe filhas a sobrescrever o metodo
}
