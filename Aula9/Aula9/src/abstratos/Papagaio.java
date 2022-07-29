package abstratos;

public class Papagaio extends Ave{
	
	@Override
	public void correr() { // Precisa obrigatoriamente pois é a primeira classe concreta
		System.out.println("Sobrescrevi Ave como Papagaio");
		
	}
}
