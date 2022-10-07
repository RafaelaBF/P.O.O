package throwexemplo;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(120);
		double valor = 1000;
	
		Utils.libereDinheiro(valor); // Ver outro exemplo com try/catch
		System.out.println("Não é possivel sacar!");
		
		System.out.println("Fim do programa");
	}

}
