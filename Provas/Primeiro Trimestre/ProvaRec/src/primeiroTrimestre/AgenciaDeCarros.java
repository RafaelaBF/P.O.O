package primeiroTrimestre;

public class AgenciaDeCarros {
	private Carro[] arrayCarros;

	public AgenciaDeCarros() {
		this.arrayCarros = new Carro[100];
	}
	
	public boolean inserirCarros(Carro car) {
		for(int i = 0; i < arrayCarros.length; i++) {
			if(this.arrayCarros[i]==null) {
				this.arrayCarros[i] = car;
				return true;
			}
		}
		return false;
	}

	public Carro[] getArrayCarros() {
		return arrayCarros;
	}
	
}
