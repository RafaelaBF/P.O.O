
public class Conta {
	private String nomeCliente;
	private double saldo;
	
	public boolean sacar(double val) {
		if(val > saldo) {
			return false;
		} else {
			saldo = saldo - val;
			return true;
		}
	}
	
	public void depositar(double val) {
		this.saldo += val;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void transferir(Conta c1, Conta c2, double val) {
		if(val > c1.saldo) {
			System.out.println("Operação inválida. Saldo insuficiente.");
		} else {
			c1.sacar(val);
			c2.depositar(val);
		}
	}
	
}
