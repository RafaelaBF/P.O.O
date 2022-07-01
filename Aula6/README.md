# Aula 6

## Construtor padrão do Java

Ao criar um objeto, sabemos que precisamos colocar o seguinte código:

```java
Objeto obj = new Objeto();
```

O "**()**" chama o construtor padrão da classe, que vai alocar um espaço na memória para guardar o objeto instanciado.

**ATENÇÃO!**

A sintaxe do construtor é **RESTRITA** somente a _public_:

```java
public <NomeDoObjeto>(){
}
```

> OBS.: Os objetos ficam na memoria, e o proprio java posteriormente consegue recolher eles da memória




## Criação dos construtores

Os construtores podem ser criados com parâmetros, em casos onde a instanciação é feita com algum valor passado inicialmente. Porém, isso exige que a instanciação de todas os objetos daquela classe sejam iniciados com o parâmetro exigido.

```java
public class Pessoa{
  private String nome;
  private int idade;
  
  public Pessoa (String n){
    this.nome = n;
  }
  public Pessoa (String n, int i){
    this.nome = n;
    this.idade = i;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String n){
    nome = n;
  }
  public int getIdade(){
    return idade;
  }
  public void setIdade(int i){
    idade = i;
  }
}
```

```java
public class Programa{
  public static void main(String[] args){
    Pessoa p1 = new Pessoa("Victor");
    p1.setIdade(18);
    System.out.println(p1.getIdade() + p1.getNome());
    Pessoa p2 = new Pessoa("Rafaela", 17);
  }
}
```

> OBS.: Ao definir um dos atributos da classe na instanciação com os construtores, é possível remover o Setter daquele atributo. Porém, isso restringe a modificação do valor daquele atributo.

> OBS.: Getters e Setters são chamados na literatura de _Encapsulamento_

## Static

Ao definir um metodo como estatico, é possivel chama-lo diretamente com o nome da classe, sem instanciar um objeto para usar.

> OBS.: Normalmente o static é utilizado em casos onde não é necessário a utilização de variaveis de instância.

```java
public class Calculadora {
  
  public int a;
  public static int b;

  public static double media (double a, double b){
    return (a + b)/2;
  }
}
```

```java
public class Teste{
  public static void main(String[] args){
    
    Calculadora calc1 = new Calculadora();
    Calculadora calc2 = new Calculadora();
    
    calc1.a = 10;
    calc2.a = 20;
    calc1.b = 13;
    calc2.b = 23;
    
    //atributos estaticos sao que nem metodos estaticos, ce nao precisa instanciar para utilizar
    //System.out.println(Calculadora.media(5, 6));
    
  }
}
```

Como "b" é estático, ele é unico da classe, então os seus objetos teoricamente "compartilham-o":

> Output: 10 20 23 23

## Dicas de Eclipse

Gerar getters e setters automaticamente:

> Botão Direito > Source > Generate Getters and Setters

ou

> Alt + Shift + S > Generate Getters and Setters



