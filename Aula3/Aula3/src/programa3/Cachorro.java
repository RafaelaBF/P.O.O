package programa3;

public class Cachorro {
	
	String nomeCachorro;
	@SuppressWarnings("unused")
	private int idadeCachorro; // Variavel privada que s� pode ser acessada por essa classe
	Double peso;
	
	public void addPeso(int add) { // Metodo
		peso = peso + add;
	}
	
	public void idade() {
		idadeCachorro = 8;
	}

}
