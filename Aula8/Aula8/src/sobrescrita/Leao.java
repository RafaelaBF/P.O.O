package sobrescrita;

public class Leao extends Animal {
	
	private String raca = "Le�o";
	private float Tamanhojuba;

	
	public String getRaca() { // Sobrescreve o m�todo de msm nome na m�e.
		return raca;
	}

	public float getTamanhojuba() {
		return Tamanhojuba;
	}

	public void setTamanhojuba(float tamanhojuba) {
		Tamanhojuba = tamanhojuba;
	}

	public void rugir() { // Ele sobrescreve o metodo de msm nome na m�e.
		System.out.println("RRRRRRRRRR...");
	}
	
}
