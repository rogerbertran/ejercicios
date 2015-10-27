package NF9;

public class Exercici3 {
	private static int num1;
	private static int num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			divisio(6,0);
		} catch (Exception e) {
			System.out.println("error, el divisor és 0!");
		}
	}

	static void divisio(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
