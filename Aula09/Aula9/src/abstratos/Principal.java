package abstratos;

public class Principal {
	
	public static void main(String[] args) {
		/* Animal animal = new Animal(); // Não pode ser chamada pois é abstrata */
		Animal gato = new Gato(); // Mas seus filhos podem (devem) ser chamados
		gato.correr();
		
		Animal[] arrayAnimal = new Animal[3]; // POde ser escrito pq não é o obj Animal e sim um Array dos Objetos, onde vai abrigar seus filhos.
		arrayAnimal[0] = new Cachorro();
	}
}
