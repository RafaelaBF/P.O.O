package exercicio1;

public class Questao1 {
	/*
	Crie uam classe chamada Estrela com dois atributos id (String), Raio (double),
	gettes e settes. Crie uma classe com o método main. Crie dois objetos de tipo
	estrela mande imprimir no console a referência aos objetos. Deve sair no console o id 
	concatenado com o raio. 
	*/
	
	public static void main(String[] args) {
		Estrela est1 = new Estrela("Sol", 123);
		Estrela est2 = new Estrela("Sirius", 456);
		System.out.println(est1);
		System.out.println(est2);
	}
}
