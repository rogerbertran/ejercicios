package NF9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcio1();
	}

	static void funcio1() {
		try {
			// 2.1 no advierte sobre SecurityException porque es un RunTimeException
			FileOutputStream f = new FileOutputStream("./test.txt");
			try {
			f.close();
			System.out.println("despres del close");
			} catch (IOException i) {
				System.out.println("error IOException");
			}
		} // No entra en el error porque el fichero existe, aunque trates el error 
		catch (FileNotFoundException e) {
			System.out.println("error FileOutputStream");
		}
	}
}
