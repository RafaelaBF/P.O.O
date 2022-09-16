package arrayDeChar;

public class Principal {
	
	public static void main(String[] args) {
		String a = "A casa é bonita";
		a = inverteString(a);
		a = criptoString(a);
		
		System.out.println(a);
	}
	public static String inverteString(String a) {
		char x[] = a.toCharArray();     //transforma a string passada em toCharArray
		String b = "";                  //cria uma String vazia para concatenar os valores
		for(int i = x.length-1; i >= 0; i--) {
			b+=x[i];                      //indo do final da string ate o inicio, e concatenando os valores
		}
		return b;                       //retorna a função
	}
	
	public static String criptoString (String a) {
		String b = ""; 
		a = a.toLowerCase(); // Coloca todos os caracteres em minuscula
		char x[] = a.toCharArray(); //transforma a string passada em toCharArray
		
		for(int i = 0; i < x.length; i++) { //percorre o array
			
			switch (x[i]) { // caso seja A ou E ou I ou O ele transforma em 4,3,1,0
				case 'a':
					x[i] = '4';
					break;
				case 'e':
					x[i] = '3';
					break;
				case 'i':
					x[i] = '1';
					break;
				case 'o':
					x[i] = '0';
					break;
				default:
					break;
			}
			
			b+=x[i]; //concatenando os valores
		}
		return b; //retorna a função
	}

}
