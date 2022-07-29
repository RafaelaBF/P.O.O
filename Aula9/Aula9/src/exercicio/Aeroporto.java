package exercicio;

public class Aeroporto {
	public static void main(String[] args) {
		Aeroporto galeao = new Aeroporto(); // Posso criar objeto dentro da classe do proprio objeto? Sim
		Aviao aviao = new Aviao();
		galeao.darPermissaoParaPouso(aviao);
	}
	private void darPermissaoParaPouso(Aviao a) { // Como não é static preciso instanciar aeroporto para acessar
		a.pousar();
	}
}
