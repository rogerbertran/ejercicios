package NF9;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			funcio1();
		} catch (IOException e) {
			System.out.println("error de fitxer");
		} catch (SecurityException e) {
			System.out.println("error de seguretat");
		}
	}

	static void funcio1() throws IOException, SecurityException {
		// 2.1 no advierte sobre SecurityException porque es un
		// RunTimeException
		FileOutputStream f = new FileOutputStream("/aaa.txt");
		f.close();
		System.out.println("despres del close");
	}
}
