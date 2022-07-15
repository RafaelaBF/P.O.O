import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Leao miau = new Leao();
		miau.setNome("Simba");
		System.out.println(miau.getNome());
		Animal x = new Leao();		//isso compila
		x.setNome("Simba");							//pois leão é o tipo especif
		//x.rugir();					//isso não compila, pois pra variavel ela é do tipo animal, não leão.
		
		Leao y = new Leao();
		Animal a = y;				//polimorfismo
		a.setNome("Simba");			//graças a isso, a variavel "a" do tipo animal consegue acessar os valores em comum que ela tem com Leao
		//a.rugir();				//novamente, isso não funciona pois a variavel é do tipo Animal, e rugir é especifico do tipo Leao
		
		Leao z = new Leao();		//nesse caso, sai Leao correndo, pois em tempo de execução, como leao tem o metodo correr(), e a variavel inicializada na
		Animal b = z;				//memoria é Leao, então ele chama correr() de Leao que está sobrescrevendo o correr de Animal.
		//b.rugir();
		b.correr();					
	
		
		Animal aa = new Leao();		//mesma coisa nesse caso, como o objeto instanciado com o 'new' foi o Leao, é o "correr()" do Leao que foi chamado
		aa.correr();
		Leao bb = (Leao)aa;			//ao fazer o casting, é possivel utilizar os metodos especificos de classes filhas ao atribuir a principal com um casting
		bb.rugir();					//da classe filha
		
		
		
		//mexendo com arrays
		//foi criado um array de 8 animais, onde ele será populado
		Animal [] corrida = new Animal[8];
		corrida[0] = new Leao();
		corrida[1] = new Urso();
		corrida[2] = new Tigre();
		corrida[3] = new Arara();
		corrida[4] = new Leao();
		corrida[5] = new Urso();
		corrida[6] = new Tigre();
		corrida[7] = new Arara();
		
		//neste caso, caso o item atual do array seja uma instância de Leao, ele faz o casting para uma variavel e usa o método rugir();
		for(int i = 0; i < corrida.length; i++) {
			corrida[i].correr();
			if(corrida[i] instanceof Leao) {
				Leao leo = (Leao)corrida[i];
				leo.rugir();
			}
		}
		
	}								

}
