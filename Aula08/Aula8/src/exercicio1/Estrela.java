package exercicio1;

public class Estrela {
	private String id;
	private double raio;
	
	public Estrela(String id, double raio) {
		this.id = id;
		this.raio = raio;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public String toString() {
		return "Id: " + this.id + "\nRaio: " + this.raio;
	}
	
}
