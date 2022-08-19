# Quest�o 1 
> Desenvolva o c�digo conforme pedido abaixo:

## A
Escreva uma classe Aluno com 3 atributos privados: id (String),  nome (String) e nota (double). Crie os getters e setters apenas se precisar. Crie em Aluno APENAS UM construtor, que recebe o id como argumento.  Implemente um m�todo em uma classe chamada Utils com a seguinte assinatura: public static boolean existe (ArrayList x, Aluno y). Escreva esse m�todo de forma que seja verificada a exist�ncia do objeto Aluno representado por y na lista representada por x, retorne verdadeiro se existir e falso se n�o existir. Considere que dois objetos Aluno s�o iguais se possuem o mesmo id. N�o � permitida qualquer itera��o para realizar esse item, ou seja, n�o use for, iterator, etc. Implemente o que for necess�rio para o funcionamento.

## C
Ao utilizar o System.out.println em um objeto Aluno, deve sair no console o id, nome e nota da Aluno. 

## D
Crie 2 subclasses da classe Aluno: AlunoRegular e AlunoEspecial. Ao utilizar o System.out.println em um objeto AlunoRegular, deve ser exibido no console, [AlunoRegular] al�m do id, nome e nota. Reutilize o m�todo do item C. Fa�a semelhenta para AlunoEspecial, mas com [AlunoEspecial].

## E
Dada a classe Utils, crie o m�todo public Aluno[] retornaDados(List listaAlunos), utilizando o ITERATOR nessa quest�o.
Considere que o conjunto recebido como argumento (listaAlunos) cont�m Strings no seguinte formato: id#nome#nota#tipo. Por exemplo, considere os elementos desse conjunto como (154-3#Simba Silva#3.7#R, 553-2#Juju Juba#10.0#E, etc.). Esses valores representam id, nome, nota e tipo do Aluno (AlunoRegular ou AlunoEspecial). Dessa maneira, implemente o m�todo retornaDados de forma que seja retornado um array da seguinte forma: os elementos de listaAlunos devem ser percorridos, o id, nome e nota devem ser atribu�dos e os valores do �ltimo caractere representam objetos do tipo AlunoRegular ou AlunoEspecial. Resumindo, voc� ir� criar um objeto AlunoRegular (se o �ltimo caractere da string for R) ou AlunoEspecial representando cada elemento em conjuntoAlunos (se o �ltimo caractere da string for E) e adicionar a lista. Caso o �ltimo caractere n�o seja R nem E, imprima no console �Erro geral�. 

## F
Crie uma nova classe, denominada ProgramaPrincipal. O programa dever� receber do console 100 strings no seguinte formato: id#nome#nota#tipo (i.e., mesmo formato explicado no item E).  Utilizando os m�todos j� criados, exiba no console os nomes e notas dos alunos com os nomes ordenados em ordem alfab�tica.
