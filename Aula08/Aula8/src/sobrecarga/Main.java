package sobrecarga;

public class Main {
	
	public static void main(String[] args) {
		// Passando todos os parametros que chama o construtor 1.
		Animal caoCadastro = new Animal("Auau", 8, 6.3f);
		
		// Passando só a String e Float que chama o construtor 3.
		Animal caoSoPeso = new Animal("Toto", 2.3f);	
		
		System.out.println("O cão " + caoCadastro.getNome() + " usa o contrutor 1, pois fez o cadastro completo");
		System.out.println("O cão " + caoSoPeso.getNome() + " usa o contrutor 3, pois o tutor não sabe a idade");
	}
}
