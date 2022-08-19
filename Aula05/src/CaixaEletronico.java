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
