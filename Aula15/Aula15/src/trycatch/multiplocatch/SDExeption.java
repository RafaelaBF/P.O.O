package trycatch.multiplocatch;

public class SDExeption extends RuntimeException {
	private double valor;

	public SDExeption(double valor) {
		super();
		this.valor = valor;
		System.out.println("Exeption personalizado: " + "Tentou sacar " + valor );
	} 
}
