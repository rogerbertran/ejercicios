package NF9;

public class Exercici1 {
	public static void main(String s[]) throws ArrayIndexOutOfBoundsException {
		try {
			funcio1();
		} finally {
			System.out.println("codi de finally");
		}
	}

	static void funcio1() {
		System.out.println("entres a la funcio 1");
		funcio2();
		System.out.println("Surts de la funcio 1");
	}

	static void funcio2() {
		try {
			System.out.println("entres a la funcio 2");
			funcio3();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Executem error a la funcio 2");
		}
		System.out.println("Surts de la funcio 2");
	}

	static void funcio3() {
		System.out.println("entres a la funcio 3");
		int[] array = { 1, 2, 3 };
		System.out.println(array[4]);
		System.out.println("Surts de la funcio 3");
	}
}
