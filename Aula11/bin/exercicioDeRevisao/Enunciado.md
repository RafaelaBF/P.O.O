# Questão 1 
> Desenvolva o código conforme pedido abaixo:

## A
Escreva uma classe Aluno com 3 atributos privados: id (String),  nome (String) e nota (double). Crie os getters e setters apenas se precisar. Crie em Aluno APENAS UM construtor, que recebe o id como argumento.  Implemente um método em uma classe chamada Utils com a seguinte assinatura: public static boolean existe (ArrayList x, Aluno y). Escreva esse método de forma que seja verificada a existência do objeto Aluno representado por y na lista representada por x, retorne verdadeiro se existir e falso se não existir. Considere que dois objetos Aluno são iguais se possuem o mesmo id. Não é permitida qualquer iteração para realizar esse item, ou seja, não use for, iterator, etc. Implemente o que for necessário para o funcionamento.

## C
Ao utilizar o System.out.println em um objeto Aluno, deve sair no console o id, nome e nota da Aluno. 

## D
Crie 2 subclasses da classe Aluno: AlunoRegular e AlunoEspecial. Ao utilizar o System.out.println em um objeto AlunoRegular, deve ser exibido no console, [AlunoRegular] além do id, nome e nota. Reutilize o método do item C. Faça semelhenta para AlunoEspecial, mas com [AlunoEspecial].

## E
Dada a classe Utils, crie o método public Aluno[] retornaDados(List listaAlunos), utilizando o ITERATOR nessa questão.
Considere que o conjunto recebido como argumento (listaAlunos) contém Strings no seguinte formato: id#nome#nota#tipo. Por exemplo, considere os elementos desse conjunto como (154-3#Simba Silva#3.7#R, 553-2#Juju Juba#10.0#E, etc.). Esses valores representam id, nome, nota e tipo do Aluno (AlunoRegular ou AlunoEspecial). Dessa maneira, implemente o método retornaDados de forma que seja retornado um array da seguinte forma: os elementos de listaAlunos devem ser percorridos, o id, nome e nota devem ser atribuídos e os valores do último caractere representam objetos do tipo AlunoRegular ou AlunoEspecial. Resumindo, você irá criar um objeto AlunoRegular (se o último caractere da string for R) ou AlunoEspecial representando cada elemento em conjuntoAlunos (se o último caractere da string for E) e adicionar a lista. Caso o último caractere não seja R nem E, imprima no console “Erro geral”. 

## F
Crie uma nova classe, denominada ProgramaPrincipal. O programa deverá receber do console 100 strings no seguinte formato: id#nome#nota#tipo (i.e., mesmo formato explicado no item E).  Utilizando os métodos já criados, exiba no console os nomes e notas dos alunos com os nomes ordenados em ordem alfabética.
