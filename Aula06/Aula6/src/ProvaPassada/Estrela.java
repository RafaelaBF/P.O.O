package ProvaPassada;

public class Estrela {
	private String nome;
	public int p1;
	public static int p2;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Estrela() {
		p1 ++;
		p2 ++;
	}
}
