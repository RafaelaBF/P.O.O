package extensaoFinal;

public class Abc {
	public final String DIRETORIO = "C:/teste"; // S� recebe um valor uma vez
	
	public void teste() {
		@SuppressWarnings("unused")
		final String MEU_DIRETORIO;
		MEU_DIRETORIO=""; // Pode ser inicializada uma vez depois de dec�larada sem valor SE carantia de execu��o.
	}
	
	public final void correr() { // N�o pode ser sobrescrito
		
	}
}
