package abstratos;

public class Papagaio extends Ave{
	
	@Override
	public void correr() { // Precisa obrigatoriamente pois � a primeira classe concreta
		System.out.println("Sobrescrevi Ave como Papagaio");
		
	}
}
