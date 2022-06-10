import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Conta c = new Conta();
		Scanner sc = new Scanner(System.in);
		c.depositar(1000);
		System.out.println("Quanto quer sacar? ");
		double valor = sc.nextDouble();
		if(c.sacar(valor)) {
			System.out.println("Liberando " + valor + " reais");
		} else {
			System.out.println("Sem saldo.");
		}
		sc.close();
	}

}
