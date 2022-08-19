package Program;
import Program.Cao;

public class DesafioDeProva {
	public static void main(String[] args) {
		Cao c1 = new Cao();
		c1.nome = "Bidu";
		
		Cao c2 = new Cao();
		c2.nome = "Pluto";
		
		Cao c3 = c1;
		c3.nome = "Toto";
		
		// O que o programa imprimirar?
		System.out.println(c1.nome);
	}
}
