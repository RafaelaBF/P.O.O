package exercicioDeRevisao;

public class Aluno {
	private String id;
	private String nome;
	private double nota;
	
	public Aluno(String id) {
		super();
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", nome=" + nome + ", nota=" + nota + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Aluno) {
			Aluno al = (Aluno) o;
			return id.equals(al.id);
		}
		return false;
	}
	

}
