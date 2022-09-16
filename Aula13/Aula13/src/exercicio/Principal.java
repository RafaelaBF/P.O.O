package exercicio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		int quant = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < quant; i++) {
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			sc.nextLine();
			m.put(nome, idade);
		}
		System.out.println(mediaHash(m));
		
		sc.close();
	}
	
	public static double mediaHash(HashMap<String, Integer> m) {
		double media = 0;
		Collection<Integer> c = m.values();
		Iterator<Integer> iter = c.iterator();
		while(iter.hasNext()) {
			media += (int)iter.next();
		}
		return media/m.size();
	}
	
	public static double mediaOutaForma(Map<String, Integer> m) {
		double soma = 0;
		Set<String> c = m.keySet();
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			String k = (String) o;
			int i = (int)m.get(k);
			soma += i;
		}
		return soma/m.values().size();
	}
}