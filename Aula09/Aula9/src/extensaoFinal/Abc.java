package extensaoFinal;

public class Abc {
	public final String DIRETORIO = "C:/teste"; // Só recebe um valor uma vez
	
	public void teste() {
		@SuppressWarnings("unused")
		final String MEU_DIRETORIO;
		MEU_DIRETORIO=""; // Pode ser inicializada uma vez depois de decçlarada sem valor SE carantia de execução.
	}
	
	public final void correr() { // Não pode ser sobrescrito
		
	}
}
