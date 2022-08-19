package ConstrutorSemParametro;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Sonia");
		p1.setIdade(15);
		
		System.out.println("A idade de "+ p1.getNome() + " eh: " + p1.getIdade());
		
	}
}
