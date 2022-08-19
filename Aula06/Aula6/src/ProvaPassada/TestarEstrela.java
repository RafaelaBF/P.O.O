package ProvaPassada;

public class TestarEstrela {
	
	// Objetivo é escrever qual serão as saidas dos print.
	
	public static void main(String[] args) {
		Estrela v1 = new Estrela();
		v1.setNome("Sirius");
		
		Estrela v2 = new Estrela();
		Estrela v3 = new Estrela();
		v2.setNome("Rigel");
		
		teste1(v1,v2);
		
		System.out.println("print3: " + v1.getNome());
		System.out.println("print4: " + v2.getNome());
		
		int x = 81;
		v1.p1 = 11;
		v1.p1 = v2.p1;
		System.out.println("X1: " + x);
		
		teste2(v1.p1, x, v1);
		
		System.out.println("print6: " + v1.getNome());
		System.out.println("X2: " + x);
		System.out.println("print7: " + v1.p1);
		System.out.println("print8: " + v1.p2);
		
		teste3(v2);
		System.out.println("print9: " +v2.getNome());
		System.out.println("print10: " +v2.p1);
		
		v3 = teste3(v2);
		v3.setNome("Altair");
		System.out.println("print12: " + v2.getNome());
	}
	
	public static void teste1(Estrela v2, Estrela v1) {
		v1.setNome(" Sol");
		v1 = v2;
		v1.setNome(" Antares");
		v2 = v1;
		System.out.println("print3: " + v1.getNome() + v2.getNome());
	}
	
	public static void teste2(int x, int a, Estrela arv) {
		a = 12;
		x = 18;
		arv.setNome("Conopus");
		arv = new Estrela();
		arv.p1 = 46;
		arv.p2 = 33;
		System.out.println("print5: " + a + x + arv.getNome());
	}
	
	public static Estrela teste3(Estrela v2) {
		v2 = new Estrela();
		v2.setNome("Vega");
		System.out.println("print11: " + v2.getNome());
		return v2;
	}
}
