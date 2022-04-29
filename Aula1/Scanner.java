import java.util.Scanner;

public class Scanner {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("qual teu nome? " + '\n');
		String nome = myObj.nextLine();
		System.out.println("hueeeba " + nome + ", bão?");
	}
}
