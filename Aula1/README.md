# Aula 1

Aula de POO com o prof: Gustavo
Email: gpgs1978@gmail.com

## Matéria

Entrar no slide Aula 1 do prof.

### Introdução a programa Java
- Programas java consistem em partes, chamadas class.
- As classes incluem outras partes que consistem em métodos, que realizam tarefas e retornam informações ao concluir.

Qualquer lugar pode conter programa Java, editor de texto, IDES..., mas para rodar o programa existe um intermediário, compilar o arquivo 


Um arquivo ".java" compilado em um bytecode.
> Inclusive dá para abrir depois de compilar para ver o código.

No C se vc compilou em um sistema operacional vc não pode compilar em outro sistema. Já no Java você pode compilar em qualquer sistema e rodar em qualquer sistema, pois ele não compila para o sistema operacional mas para o JVM (Java Virtual Machine)

## Estrutura do Java

- Um arquivo terá extensão ".java" e contém uma definição de class 
- Toda classe tem um ou mais métodos.


### Boas práticas
- O nome da classe sempre deve começar com letra maiúsculas, assim como as palavras internas, não se usa acentuação, nem "ç" e nem espaço.

### Executar a classe
- Ao executar um método será procurado inicialmente. O método "main".
- No programa inteiro deve haver ao menos um método main, pois o programa tem que começar de algum lugar.
- Nem toda precisam ter um método main.

```java
public static void main(String[] args) {
		// seu codigo
	}
```
- Em Java "String" é uma classe, por isso começa com letra maiúscula.

## Código em Java com editor de Texto - Linux

> Codigo do editor NomeDoArquivo.java  
> Nome do arquivo o mesmo que a classe

pwd - ver qual é o diretório
ls - listar o que tem no diretório
javaC NomeDoArquivo.java - compilar o java
java NomeDoArquivo - Rodar

```java
public class MyFirstApp {
	public static void main(String[] args){
		System.out.println("qualquer coisa");
		System.out.println("heeba " + args[0] + args[1] + ", bão?");
	}
}
```
Na hora de executar o programa com java NomeDoArquivo , ao colocar outros textos do lado, o programa guarda esses textos como argumento no array declarado no PSVM(String[] args)

```bash
~$ javac MyFirstApp.java
~$ java MyFirstApp atim taporra
qualquer coisa
hueeeba atimtaporra, bão?
```
