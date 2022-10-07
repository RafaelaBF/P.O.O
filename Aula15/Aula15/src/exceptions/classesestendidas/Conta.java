package exceptions.classesestendidas;

public class Conta {
	private double saldo;
	
	public boolean sacar(double valor) {
		/*Não seria é interessante fazer um try/catch aqui pois precisamos receber a resposta de erro*/
		if(valor > saldo) {
			System.out.println("Não é possivel sacar, saldo insuficiente");
			/* O throw para o sistema, por isso em alguns casos não é tão interesante, precisa de um try/catch para continuar*/
			throw new SDExeption("Saldo:" + valor); 
		}else {
			saldo -= valor;
			return true;
		}
	}
	
	public void depositar (double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}
}
