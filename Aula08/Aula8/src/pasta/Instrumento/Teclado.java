package pasta.Instrumento;

public class Teclado {
	int numeroSons;
	String cor;
	
	public Teclado(int numeroSons, String cor) {
		this.numeroSons = numeroSons;
		this.cor = cor;
	}
	
	public int getNumeroSons() {
		return numeroSons;
	}
	public void setNumeroSons(int numeroSons) {
		this.numeroSons = numeroSons;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Teclado [numeroSons=" + numeroSons + ", cor=" + cor + "]";
	}
}
