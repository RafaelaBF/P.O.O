## Teste do Primeiro Trimestre
---
### Questão 1 (1,0)
Crie uma aplicação que receba do console 100 valores numéricos positivos e imprima no console o menor e o maior valor. PS: Primeiro preencha em array com os valores e, em seguida, percorra o array para encontrar o menor e maior valores.

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
Crie a classe Passageiro. Passageiro possui os atributos nome (String) e peso (double). Crie a classe Onibus. Onibus possui os atributos passageiros, que é um array de Passageiro e placa (String). Considere que o ônibus só tem 50 lugares, ou seja, o array tem tamanho 50.


