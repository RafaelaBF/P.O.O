package interfc;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		arr.add("ddd");
		arr.add("eee");
		System.out.println(arr);
		arr.set(0, "zzz");
		System.out.println(arr);
		arr.remove("ccc");
		System.out.println(arr);
		System.out.println(tamanhoMedioStrings(arr));
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr2.add("eee");
		arr2.add("ddd");
		arr.removeAll(arr2);
		System.out.println(arr);
	}

	public static double tamanhoMedioStrings(ArrayList<Object> x) {
		double media = 0.0;
		for(int i = 0; i < x.size(); i++) {
			String y = (String) x.get(i);
			media += y.length();
		}
		return media/x.size();
	}
}
