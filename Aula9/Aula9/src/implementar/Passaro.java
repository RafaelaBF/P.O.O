package implementar;

public class Passaro extends Animal implements Voador, Oviparo /* Posso implementar muitas interfaces*/{

	@Override
	public void levantarVoo() {
		System.out.println("Voar, Voar, subir, subir");
	}

	@Override
	public void pousar() {
		System.out.println("Olha a bombaaaa");
	}

	@Override
	public void voar() {
		System.out.println("Passarinhos soltos a voar disposto...");		
	}

	@Override
	public void botarOvo() {
		System.out.println("Aiii! BuaBua..pari!");	
	}
	
}
