package pasta.Informatica;

public class Teclado {
	int numeroTeclas;
	String tipoEntrada;
	
	public Teclado(int numeroTeclas, String tipoEntrada) {
		this.numeroTeclas = numeroTeclas;
		this.tipoEntrada = tipoEntrada;
	}
	
	public int getNumeroTeclas() {
		return numeroTeclas;
	}
	public void setNumeroTeclas(int numeroTeclas) {
		this.numeroTeclas = numeroTeclas;
	}
	public String getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	@Override
	public String toString() {
		return "Teclado [numeroTeclas=" + numeroTeclas + ", tipoEntrada=" + tipoEntrada + "]";
	}
}
