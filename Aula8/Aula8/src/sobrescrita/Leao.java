package sobrescrita;

public class Leao extends Animal {
	
	private String raca = "Leão";
	private float Tamanhojuba;

	
	public String getRaca() { // Sobrescreve o método de msm nome na mãe.
		return raca;
	}

	public float getTamanhojuba() {
		return Tamanhojuba;
	}

	public void setTamanhojuba(float tamanhojuba) {
		Tamanhojuba = tamanhojuba;
	}

	public void rugir() { // Ele sobrescreve o metodo de msm nome na mãe.
		System.out.println("RRRRRRRRRR...");
	}
	
}
