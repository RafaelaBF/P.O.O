
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
	
	public double getSaldo() {
		return saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void transferir(Conta c, double val) {
		if(sacar(val) == false) {
			System.out.println("Operação inválida. Saldo insuficiente.");
		} else {
			c.depositar(val);
		}
	}
	
}
