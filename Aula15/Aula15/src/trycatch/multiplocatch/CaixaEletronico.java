package trycatch.multiplocatch;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(120);
		double valor = 1000;
		
		try{
			c.sacar(valor);
			Utils.libereDinheiro(valor);
		}catch (SDExeption e) {
			System.out.println("N�o � possivel sacar!");
		}catch (RuntimeException e) {
			System.out.println("Deu algum erro que n�o esva previsto, mas commun" + e);
		}catch (Exception e) {
			System.out.println("Esse � um erro mais generico" + e);
		}
		
		System.out.println("Fim do programa");
	}

}
