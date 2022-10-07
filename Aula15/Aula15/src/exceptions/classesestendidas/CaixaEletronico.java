package exceptions.classesestendidas;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(120);
		double valor = 1000;
		
		try{
			c.sacar(valor);
			Utils.libereDinheiro(valor);
		}catch (SDExeption e) {
			System.out.println("N�o � possivel sacar!" + e.getMessage());
		}
		
		System.out.println("Fim do programa");
	}

}
