# Aula 15

OBS.: essas anotações tão uma confusão, olhar o .pdf que o prof disponibilizou.

## Esse código está correto?

> classe Conta

```java
public class Conta{
  private double saldo;
  public boolean sacar(double valor){
    if(valor > saldo){
      System.out.println("Nao e possivel sacar.");
      return false;
    } else {
      saldo -= valor;
      return true;
    }
  }
  
  public void depositar(double valor){
    saldo += valor;
  }
  
  public double getSaldo(){
    return saldo;
  }
}
```

> classe CaixaEletronico

```java
public class CaixaEletronico{
  public static void main(String[] args){
    Conta c = new Conta();
    c.depositar(100);
    double valor = 1000;
    if(c.sacar(valor)){
      Utils.liberarDinheiro(valor);
    } else {
      System.out.println("Voce nao tem saldo, deseja fazer um emprestimo? Clique Aqui");  
    }
  }
}
```

Na classe acima, caso não tivesse o if com o c.sacar, seria possivel sacar infinitamente o valor com o utils.liberardinheiro e o valor na conta continuaria o mesmo, já que o c.sacar retorna false porem nao muda o valor da conta.

Em casos como esse, usaremos uma funcionalidade para **tratamento de exceções**.

As excessões em java podem ser classes e/ou objetos.

## Exceptions

> adicionar depois os codigos

Ao receber uma Exception no terminal, é apresentado o erro, e os locais aonde ocorreram (linhas, objetos, metodos).


Em qualquer forum ou lista de discussão, é comum enviarem junto com a descrição do problema essa stacktrace. Por que isso aconteceu: o sistema de exceções do java funciona da seguinte maneira:

Quanto uma exceção é lançada (throws) a JVM entra em um estado de alerta e vai ver se o metodo atual toma alguma precaução ao tentar executar esse trecho de codigo. como podemos ver, o metodo2 nao toma nenhuma medida diferente do que vimos ate agora.


Para tratarmos as exceções, utilizamos da estrutura Try/Catch, onde dentro do Try colocamos o "codigo perigoso", e o Catch está preparado para pegar um tipo de exceção para tratar.

> ex.:

No catch, é possível definir como tratar o tipo de exceção definido, e dependendo de onde a estrutura estiver, o caminho do codigo/stacktrace será tratado de forma diferente.


## Tratamento de Exceções

- Um ArrayIndexOutOfBoundsException ou um NullPointerException poderia ser facilmente evitado com o for corretamente escrito ou com ifs que checariam os limites da array.
- Outro caso em que também ocorre tal tipo de exceção é quando um cast errado é feito
- Em todos esses casos, tais problemas provavelmente poderiam ser evitados pelo programador. É por esse motivo que o java nao te obriga

Existem varios tipos de Exceção, porém tem duas principais divisões dessas exceções:

- Checked 
- Unchecked

Nas checked, o compilador te obriga a tratar esse tipo de exceção, pois o compilador não sabe o que fazer quando se deparar com esta exceção.


> colocar a hierarquia das classes das exceções

é possivel criar classes que extendem as classes de exceção

TODAS AS CLASSES FILHAS E A CLASSE EXCEPTION EM SI SÃO CHECKED.

TODAS AS RUNTIMEEXCEPTION E SUAS FILHAS SÃO UNCHECKED


## outras coisa

é possível "lançar" novas exceções, ao criar(instanciar) dependendo da necessidade

é possivel utilizar isto com o try catch para evitar que o programa pare imediatamente no momento que a exceção for pega.

primeiramente, se entra no try, faz as coisas dentro dele, e ao retornar uma exception, o catch pega ela, e guarda em uma variavel do tipo da exceção, permitindo que o codigo continue a rodar, e não pare imediatamente.

> arquivo Conta.java
```java

public class Conta {
	private double saldo;
	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Não é possível sacar.");
			throw new RuntimeException();
		} else {
			saldo -= valor;
		}
	}
	public void depositar(double valor) {
		saldo += valor;
	}
}

```

> arquivo CaixaEletronico.java
```java

public class CaixaEletronico {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(100);
		double valor = 1000;
		try {
			c.sacar(valor);
			System.out.println("Liberando " + valor);
		} catch(RuntimeException e) {
			System.out.println(e);
		}
		System.out.println("Fim.");
	}
}

```

> output:

```
Não é possível sacar.
java.lang.RuntimeException
Fim.
```

## Criando uma Exception

Neste exemplo, vamos criar a SDException (Sem Dinheiro Exception)

> colocar codigo com essa exception

A importancia de criar exceptions personalizadas, é principalmente para saber com qual tipo de erro estamos lidando, e evitar complicações em um código onde várias exceptions de um mesmo tipo podem ser lançadas, como por exemplo várias RuntimeException.

- e possivel passar mensagens personalizadas nas classes criadas ao criar um construtor passando uma string e botando-a no super (mais explicado no codigo)
- a classe RuntimeException possui um método chamado .getMessage(), o qual retorna somente a mensagem retornada junto da exception recebida.
- ao colocar vários catch para receber diferentes exception, é obrigatorio que elas estejam em uma hierarquia de acordo com suas classes mãe, ou seja: vai do mais específico para o mais geral.
- no momento que uma exception é jogada, como por exemplo no codigo do .sacar(), é obrigatório que essa exceção seja pega, então o try catch é obrigatorio ao utilizar
- é possível dizer para um método que ele PODE lançar uma exception, para que no momento que o método for chamado, a classe que o chamar precise utilizar o try catch para tratá-lo.


TEM MUITA COISA QUE NAO DEU PRA COPIAR, OLHA OS CODIGO, O DOC Q ELE FEZ E REZA PRA DEUS :)
