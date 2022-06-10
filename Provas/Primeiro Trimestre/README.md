## Teste do Primeiro Trimestre
---
### Questão 1 (1,0)
- Crie uma aplicação que receba do console 100 valores numéricos positivos e imprima no console o menor e o maior valor.
> PS: Primeiro preencha em array com os valores e, em seguida, percorra o array para encontrar o menor e maior valores.

```java
public class Exerc1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int maior = 0;
    int menor = 0;
    int [] vec = new int[100];
    
    for (int i = 0; i < vec.length; i++){
      vec[i] = sc.nextInt();
    }
    for (int i = 0; i < vec.length; i++){
      if(vec[i] > maior){
        maior = vec[i];
      }
      if(vec[i] < menor){
        menor = vec[i];
      }
    }
    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
  }
}
```

### Questão 2 (1,0)
- Crie a classe *Passageiro*. Passageiro possui os atributos nome (String) e peso (double).
- Crie a classe *Onibus*. Onibus possui os atributos passageiros, que é um array de Passageiro e placa (String).
- Considere que o ônibus só tem 50 lugares, ou seja, o array tem tamanho `50`.

1. Também crie um método denominado receberPassageiro(Passageiro p), que irá permitir a entrada dos passageiros no ônibus, ou seja, no array de Passageiros. Caso o array de Passageiros esteja cheio, você deve retornar o valor "falso" para o método. Caso o passageiro tenha "entrado" no ônibus, retorne "verdadeiro".
2. Crie uma classe chamada Principal com o método main. Crie um objeto da classe ônibus. Receba, ainda na classe principal, 100 passageiros no console. Receba o nome e o peso dos passageiros. Crie o objeto passageiro e tente inserir no ônibus, caso o ônibus esteja cheio (array cheio), imprima no console: "Ônibus cheio".

```java
public class Passageiro {
  String nome;
  double peso;
}

public class Onibus {
  Passageiro [] passageiros = new Passageiro[50];
  String placa;
}

public boolean receberPassageiro(Passageiro p){
  for(int i = 0; i < passageiros.length; i++){
    if(passageiros[i] == null){
      passageiros[i] = p;
      return true;
    }
  }
  return false;
}
```
> No arquivo principal
```java
public class Principal {
  public static void main (String args []) {
    Onibus on = new Onibus();
    Scanner sc = new Scanner (System.in);
    for(int i = 0; i < 100; i++){
      Passageiro p = new Passageiro();
      System.out.println("Insira o nome: ");
      p.nome = sc.nomeLine();
      System.out.println("Insira o peso: ");
      p.peso = sc.nextDouble();
      sc.nextLine();
      if(!receberPassageiro(p)) {
        System.out.println("Ônibus cheio.");
      }
    }
    System.out.println(calculaMedia(on));
  }
  public static double calculaMedia(Onibus x) {
    double soma = 0;
    for(int i = 0; i < x.passageiros.length; i++) {
      soma += passageiros[i].peso;
    }
    return soma / x.passageiros.length;
  }
}
```
