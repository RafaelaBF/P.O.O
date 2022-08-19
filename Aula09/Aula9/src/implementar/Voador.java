package implementar;

public interface Voador {
	
	public static final boolean PODE_VOAR = true; 
	String TERRITORIO = "Ar"; // N�o precisa colocar pois j� � public static final
	double GRAVIDADE = 9.87666;
	
	public abstract void levantarVoo(); 
	public void pousar(); // Como todo metodo da interface � abstract, n�o precisa colocar
	public void voar();
}
