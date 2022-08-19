package interfc;

public class Pessoa {
	private String cpf;
	
	public Pessoa(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Pessoa) {			//caso seja uma instancia de pessoa, faz a checagem
			Pessoa p = (Pessoa) o;			//faz o casting para String do objeto recebido
			return this.cpf.equals(p.cpf);	//reutiliza o .equals das Strings cpf do que foi chamado(this) com a que foi passado(p)
		}
		return false;
	}
	
}
