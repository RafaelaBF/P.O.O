package metodoSplit;

public class Principal {

	public static void main(String[] args) {
		String k = "A casa é bonita";
		String s[] = k.split(" "); // Transforma em vetor cortando nos espaços.
		
		for(int i = 0; i < s.length; i++) { 
			System.out.print(s[i]);
		}
		System.out.println();
		
		String aluno = "Amanda#12";
		String a[] = aluno.split("#");
		
		Aluno al = new Aluno(a[0], Integer.parseInt(a[1]));
		
		System.out.println("O aluno(a) " + al.getNome() + " tem " + al.getIdade() + " anos de idade.");
	}
}
