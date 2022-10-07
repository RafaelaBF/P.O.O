package exceptions.classesestendidas.obrigatoriotrycatch;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(120);
		double valor = 1000;
		
		// c.sacar(valor);  Não deixa vc usar sem o try/catch
		// Utils.libereDinheiro(valor);
		
		try{
			c.sacar(valor);
			Utils.libereDinheiro(valor);
		}catch (SDExeption e) {
			System.out.println("Não é possivel sacar!" + e.getMessage());
		}
		
		System.out.println("Fim do programa");
	}

}
