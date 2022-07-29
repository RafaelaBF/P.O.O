package primeiroTrimestre;

public class Carro {
	private String placa;
	private String marca;
	private String modelo;
	private double preco;
	
	public Carro(String placa, String marca, String modelo, double preco) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
