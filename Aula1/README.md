# Aula 1

Aula de POO com o prof: Gustavo
Email: gpgs1978@gmail.com

## Matéria

Entrar no slide Aula 1 do prof.

### Introdução a programa Java
- Programas java consistem em partes, chamadas class.
- As classes incluem outras parte que consistem em métodos, que realizam tarefas e retornam informações ao concluir.

Qualquer lugar pode conmter programa Java, editor de texto, IDES..., mas para rodar o programa existe um itermediario, compilar o arquivo 


Um arquivo ".java" compilado em um bytecode.
> Inclusive da para abrir depois de compilar para ver o codigo.

No C se vc compilou em um sitema operacional vc não pode compilar em outro sistema. Já no Java vc pode compilar em qualquer sistema e rodar em qualquer sistema, pois ele não compila para o sistema operacional mas para o JVM (Java Virtual Machine)

## Estrutura do Java

- Um arquivo terá extenção ".java" e contem uma definião de class 
- Toda classe tem um ou mais metodos.


### Boas proticas
- Nome da classe sempre deve começar com letra maiusculas, assim como as palavras internas, não se usa acentuação, nem "ç" e nem espaço.

### Executar a classe
- Ao executar um metodo será procurado inicialmente. O metodo "main".
- No programa intero deve haver ao menos um metodo main, pois o programa tem que começar de algum lugar.
- Nem toda precisa ter um metodo main.

```java
public static void main(String[] args) {
		// seu codigo
	}
```
- Em java "String" é uma classe por isso começa com letra maiuscula.

## Codigo em Java com editor de Texto - Linux

> Codigo do editor NomeDoArquivo.java  
> Nome do arquivo o mesmo que a classe

pwd - ver qual é o diretorio
ls - listar o que tem no diretorio
javaC NomeDoArquivo.java - compilar o java
java NomeDoArquivo - Rodar

```java
public class MyFirstApp {
	public static void main(String[] args){
		System.out.println("qualquer coisa");
		System.out.println("hueeeba " + args[0] + args[1] + ", bão?");
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
