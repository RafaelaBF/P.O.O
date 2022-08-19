package exercicioDeRevisao;

public class AlunoRegular extends Aluno {

	public AlunoRegular(String id) {
		super(id);
	}
	
	@Override
	public String toString() {
		return "[AlunoRegular]" + super.toString();
	}
}
