package ConstrutorComParametro;

public class Main {

	public static void main(String[] args) {
		// Pessoa p1 = new Pessoa(); --> Isso dar erro pois não há contrutor vazio;
		
		Pessoa p1 = new Pessoa("Sonia", "483.599.440-08");
		
		p1.setIdade(15);
		
		System.out.println("A idade de "+ p1.getNome() + " eh: " + p1.getIdade());
		
	}
}
