package abstratos;

public class Principal {
	
	public static void main(String[] args) {
		/* Animal animal = new Animal(); // N�o pode ser chamada pois � abstrata */
		Animal gato = new Gato(); // Mas seus filhos podem (devem) ser chamados
		gato.correr();
		
		Animal[] arrayAnimal = new Animal[3]; // POde ser escrito pq n�o � o obj Animal e sim um Array dos Objetos, onde vai abrigar seus filhos.
		arrayAnimal[0] = new Cachorro();
	}
}
