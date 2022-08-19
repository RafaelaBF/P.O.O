package exercicioDeRevisao;

public class AlunoEspecial extends Aluno{

	public AlunoEspecial(String id) {
		super(id);
	}

	@Override
	public String toString() {
		return "[AlunoEspecial]" + super.toString();
	}
	
}
