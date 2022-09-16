package conjuntos;

import java.util.HashSet;
import java.util.Iterator;

public class Principal {
	
	public static void main(String[] args) {
		
		HashSet<String> x = new HashSet<String>();
		x.add("casa");
		x.add("bola");
		x.add("mesa");
		x.add("cama");
		x.add("cama");
		x.add("arvore");
		System.out.println(x);
		System.out.println("Media do tamanho das palavras: "+ mediaHashSet(x));

	}
	public static double mediaHashSet(HashSet<String> hs){
		double soma = 0;
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			soma+=it.next().length();
		}
		return (soma/hs.size());
	}

}
