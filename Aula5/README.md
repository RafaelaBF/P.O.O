# Aula 5

## Getters e Setters

O ideal é que apenas metodos em suas respectivas classes possam acessar seus atributos, pois deixando os atributos abertos como public qualquer classe pode alterar esses valores.



```java
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Conta c = new Conta();
		Scanner sc = new Scanner(System.in);
		c.Depositar(1000);
		System.out.println("Quanto quer sacar? ");
		double valor = sc.nextDouble();
		if(c.Sacar(valor)) {
			System.out.println("Liberando " + valor + " reais");
		} else {
			System.out.println("Sem saldo.");
		}
		sc.close();
	}

}
```

```java
public class Conta {
	String nomeCliente;
	double saldo;
	
	public boolean Sacar(double val) {
		if(val > saldo) {
			return false;
		} else {
			saldo = saldo - val;
			return true;
		}
	}
	
	public void Depositar(double val) {
		this.saldo += val;
	}
}
```

Dessa forma acima, o main, e todos os outros arquivos no package tem acesso aos atributos da classe Conta. Por isso, precisamos privar os dados para que somente a classe conta tenha acesso aos seus próprios atributos.

//tem muita coisa pra anotar entao depois eu faço isso
