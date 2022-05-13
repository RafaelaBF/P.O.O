package programa3;

public class TamanhoVariavel {

	static void fun() {
		
		short i = 10;
		byte b = (byte) i;
		System.out.println(b);
		
		short a = 1000;
		byte c = (byte) a; // byte só cabe até 128
		System.out.println(c);
		
		/* short r = 10;   Não compila
		short e = 10;
		Byte y = (r + e); */
		

		short r = 10;
		short e = 10;
		Byte y = (byte) (r + e);
		System.out.println(y);

		@SuppressWarnings("unused")
		long cpf = 18097483262L; // Compila
		
		// long cpf = 18097483262; Não compila pq ele já considera um número como int
		
	}

}
