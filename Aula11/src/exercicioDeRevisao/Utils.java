package exercicioDeRevisao;

import java.util.ArrayList;

public class Utils {
	
	public static boolean existe (ArrayList<Object> x, Aluno y) {
		return x.contains(y);
	}
	
	public Aluno [] retornaDados(ArrayList<String> listaAlunos) {
		Aluno [] alunos = new Aluno[listaAlunos.size()];
		
		for (int i = 0; i < listaAlunos.size(); i++) {
			String [] dados =  listaAlunos.get(i).split("#");
			
			if(dados[3].equals("R") || dados[3].equals("r")) {
				alunos[i] = new AlunoRegular(dados[0]);
				alunos[i].setNome(dados[1]);
				alunos[i].setNota(Double.parseDouble(dados[2].toString()));	
			}else if(dados[3].equals("E") || dados[3].equals("e")) {
				alunos[i] = new AlunoEspecial(dados[0]);
				alunos[i].setNome(dados[1]);
				alunos[i].setNota(Double.parseDouble(dados[2].toString()));	
			}else {
				System.out.println("Erro geral");
			}
		}
		return alunos;
	}
}
