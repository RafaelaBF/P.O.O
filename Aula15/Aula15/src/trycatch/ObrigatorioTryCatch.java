package trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ObrigatorioTryCatch {
	
	public static void main(String[] args) {
		
		// new FileInputStream("arquivo.txt");
		
		try {
			new FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
