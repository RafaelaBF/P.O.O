package collections;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("abcd", new Pessoa());
		Pessoa p = new Pessoa();
		p.setNome("Amanda");
		m.put("kg", p);
		m.put("yy", p);
	
		Pessoa ps = (Pessoa)m.get("kg"); // Pegando o valor no hash e tranformandpo ele em pessoa novamente
		System.out.println(ps.getNome()); // 
		
		
		
	}

}
