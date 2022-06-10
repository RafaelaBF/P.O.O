# Aula 5

## Getters e Setters

O ideal é que apenas metodos em suas respectivas classes possam acessar seus atributos, pois deixando os atributos abertos como public qualquer classe pode alterar esses valores.



```java
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Scanner sc = new Scanner(System.in);
		c1.depositar(1000);
		c2.depositar(1000);
		System.out.println("Quanto quer sacar? ");
		double valor1 = sc.nextDouble();
		if(c1.sacar(valor1)) {
			System.out.println("Liberando " + valor1 + " reais");
		} else {
			System.out.println("Sem saldo.");
		}
		System.out.println("Quanto quer depositar? ");
		double valor2 = sc.nextDouble();
		c1.depositar(valor2);
		System.out.println("Novo saldo: " + c1.getSaldo());
		System.out.println("Quanto quer transferir para a conta 2? ");
		double valor3 = sc.nextDouble();
		c1.transferir(c2, valor3);
		System.out.println("Saldo conta 1: " + c1.getSaldo());
		System.out.println("Saldo conta 2: " + c2.getSaldo());
		sc.close();
	}

}

```

```java

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

```

Dessa forma acima, o main, e todos os outros arquivos no package tem acesso aos atributos da classe Conta. Por isso, precisamos privar os dados para que somente a classe conta tenha acesso aos seus próprios atributos.

//tem muita coisa pra anotar entao depois eu faço isso
