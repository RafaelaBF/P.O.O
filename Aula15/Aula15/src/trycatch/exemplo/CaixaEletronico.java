package trycatch.exemplo;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(120);
		double valor = 1000;
		
		try{
			c.sacar(valor);
			Utils.libereDinheiro(valor);
		}catch (RuntimeException e) {
			System.out.println("Não é possivel sacar!" + e);
		}
		
		System.out.println("Fim do programa");
	}

}
