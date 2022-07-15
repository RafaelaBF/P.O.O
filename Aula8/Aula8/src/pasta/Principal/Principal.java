package pasta.Principal;

import pasta.Informatica.Teclado;

public class Principal {
	
	public static void main(String[] args) {
		Teclado tec = new Teclado(28, "Teclado Pc");
		pasta.Instrumento.Teclado ins = new pasta.Instrumento.Teclado(30, "rosa"); // Caso queira chamar a classe de msm nome.
	
		System.out.println(tec.toString());
		System.out.println(ins.toString());
	}
	
}
