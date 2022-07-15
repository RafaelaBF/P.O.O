package sobrescrita;

public class Main {

	public static void main(String[] args) {
		
		Animal tartaruga = new Animal("Tortuga", "tartaruga", 30);
		Leao leao = new Leao();
		leao.setNome("Lion");
		
		tartaruga.rugir();
		leao.rugir();
		
		System.out.println(tartaruga.getNome() + ": " + tartaruga.getRaca());
		System.out.println(leao.getNome() + ": " + leao.getRaca());
		
	}
}
