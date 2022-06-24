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
    p1.setIdade(15);
    System.out.println(p1.getIdade() + p1.getNome());
    Pessoa p2 = new Pessoa("Rafaela", 17);
  }
}
```

> OBS.: Ao definir um dos atributos da classe na instanciação com os construtores, é possível remover o Setter daquele atributo. Porém, isso restringe a modificação do valor daquele atributo.

> OBS.: Getters e Setters são chamados na literatura de _Encapsulamento_



## Dicas de Eclipse

Gerar getters e setters automaticamente:

Botão Direito > Source > Generate Getters and Setters
ou
Alt + Shift + S > Generate Getters and Setters




