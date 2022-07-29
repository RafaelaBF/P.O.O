package implementar;

public interface Voador {
	
	public static final boolean PODE_VOAR = true; 
	String TERRITORIO = "Ar"; // Não precisa colocar pois já é public static final
	double GRAVIDADE = 9.87666;
	
	public abstract void levantarVoo(); 
	public void pousar(); // Como todo metodo da interface é abstract, não precisa colocar
	public void voar();
}
