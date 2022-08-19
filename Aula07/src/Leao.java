
public class Leao extends Animal{
	public void rugir() {
		System.out.println("Leao " + this.getNome() + " rugiu.");
	}
	public void correr() {		//sobrescrita
		System.out.println("Leao correndo.");
	}
}
