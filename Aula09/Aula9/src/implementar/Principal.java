package implementar;

public class Principal {
	
	public static void main(String[] args) {
		Voador ob[] = new Voador[3]; // Criando Array do tipo voador que suporta Avião e passaro 
		ob[0] = new Aviao(); // Criando os objetos
		ob[1] = new Passaro();
		ob[3] = new Passaro();
		
		for(int i = 0;i< ob.length; i++) {
			ob[i].levantarVoo(); // Pode usar os metodos dos voador
			ob[i].pousar();
		}
	}

}
